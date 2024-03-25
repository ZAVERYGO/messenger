package com.kozich.messenger.controller.filter;

import com.kozich.messenger.dao.api.UserRole;
import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.api.dto.UserDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class AdminSecurityFilter implements Filter {

    private final UserService userService = ServiceFactorySingleton.getUserService();
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String contextPath = req.getContextPath();
        HttpSession session = req.getSession(false);
        if((session!=null) && (session.getAttribute("user") !=null) &&
                (userService.getByLogin((String)session.getAttribute("user")) != null) &&
                (userService.getByLogin((String)session.getAttribute("user")).getRole().equals(UserRole.ADMIN))) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect(contextPath + "/ui/signIn");
        }
    }
}
