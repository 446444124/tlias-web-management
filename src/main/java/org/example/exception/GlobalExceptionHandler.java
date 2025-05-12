package org.example.exception;

import org.example.controller.DeptController;
import org.example.pojo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler
    public org.example.pojo.Result handleException(Exception e) {
    log.error("程序出错啦",e);
    return org.example.pojo.Result.error("对不起，操作失败，请联系管理员");
    }


    @ExceptionHandler
    public Result HandleDuplicateKeyException(DuplicateKeyException e) {
        log.error("程序出错啦",e);
        String message = e.getMessage();
        int i = message.indexOf("Duplicate entry");
        String err = message.substring(i);
        String[] arr = err.split(" ");
        return Result.error("对不起" + arr[2] + " 已存在");
    }
    @ExceptionHandler
    public Result handleClassHasStudentsException(ClassHasStudentsException e) {
        log.error("删除班级时出错：{}", e.getMessage());
        return Result.error("对不起, 该班级下有学生, 不能直接删除");
    }
}
