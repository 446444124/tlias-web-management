package org.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.example.controller.ClazzController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
//@WebFilter(urlPatterns = "/*")
public class DemoFliter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(DemoFliter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("初始化DemoFliter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("DemoFliter 开始过滤");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("销毁DemoFliter");
    }
}
