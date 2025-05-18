package org.example.filter;

import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
//@WebFilter(urlPatterns = "/*")
public class TokenFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(com.fasterxml.jackson.core.filter.TokenFilter.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取请求路径
        String path = request.getRequestURI();
        if (path.contains("/login") || path.contains("/register")) {
            log.info("登录或注册请求,放行");
            filterChain.doFilter(request, response);
            return;
        }
        //获取token
        String token = request.getHeader("token");
        //判断token是否存在
            if (token == null|| token.isEmpty()) {
                log.info("token为空,未登录");
                response.setStatus(401);
                return;
            }
            //解析token
        try {
            JwtUtils.parseJWT(token);
        } catch (Exception e) {
           log.info("token解析失败,未登录");
           response.setStatus(401);
           return;
        }
        //放行
        log.info("token解析成功,放行");
        filterChain.doFilter(request, response);

    }
    }

