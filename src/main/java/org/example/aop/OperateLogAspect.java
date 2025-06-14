package org.example.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.mapper.OperateLogMapper;
import org.example.pojo.OperateLog;
import org.example.utils.CurrentHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Aspect
@Component
@Slf4j
public class OperateLogAspect {
    @Autowired
    private OperateLogMapper operateLogMapper; // 注入Mapper

    // 切入controller包下所有方法
    @Around("@annotation(org.example.anno.Log)")
    public Object logOperate(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = null;
        OperateLog operateLog = new OperateLog();

        try {
            // 1. 获取方法基本信息
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            operateLog.setClassName(joinPoint.getTarget().getClass().getName());
            operateLog.setMethodName(signature.getMethod().getName());
            operateLog.setMethodParams(JSON.toJSONString(joinPoint.getArgs()));

            // 2. 执行目标方法并获取返回值
            result = joinPoint.proceed();
            operateLog.setReturnValue(JSON.toJSONString(result));

        } finally {
            // 3. 补充日志信息
            long endTime = System.currentTimeMillis();
            operateLog.setCostTime(endTime - startTime);
            operateLog.setOperateTime(LocalDateTime.now());
            operateLog.setOperateEmpId(getCurrentUserId()); // 需实现用户ID获取逻辑

            // 4. 异步保存日志（此处同步保存，异步可结合@Async实现）
            operateLogMapper.insert(operateLog);
        }
        return result;
    }

    // 示例：从ThreadLocal或SecurityContext获取用户ID（需根据项目实现）
    private Integer getCurrentUserId() {
        // 示例：return SecurityContextHolder.getContext().getAuthentication().getId();
        return CurrentHolder.getCurrentId(); // 模拟用户ID
    }
}