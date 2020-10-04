package com.cape.lib.management.system.config;


import org.slf4j.MDC;
import org.springframework.stereotype.Component;


import javax.servlet.*;

import java.io.IOException;
import java.util.UUID;

@Component
public class LibraryManagementFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            MDC.put("TRANSACTION",UUID.randomUUID().toString());
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            MDC.remove("TRANSACTION");
        }

    }

    @Override
    public void destroy() {
        MDC.clear();
    }
}
