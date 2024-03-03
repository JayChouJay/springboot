package com.example.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("...............CustomFilter init方法................");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("...............CustomFilter doFilter方法................");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("...............CustomFilter destory方法................");
    }
}
