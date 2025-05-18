package org.example.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class TokenInterceptor implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(TokenInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求路径
//        String path = request.getRequestURI();
//        if (path.contains("/login") || path.contains("/register")) {
//            log.info("登录或注册请求,放行");
//            return true;
//        }
        //获取token
        String token = request.getHeader("token");
        //判断token是否存在
        if (token == null|| token.isEmpty()) {
            log.info("token为空,未登录");
            response.setStatus(401);
            return false;
        }
        //解析token
        try {
            JwtUtils.parseJWT(token);
        } catch (Exception e) {
            log.info("token解析失败,未登录");
            response.setStatus(401);
            return false;
        }
        //放行
        log.info("token解析成功,放行");
        return true;

    }
}
