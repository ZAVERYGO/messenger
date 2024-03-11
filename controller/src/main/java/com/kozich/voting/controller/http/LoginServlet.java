package com.kozich.voting.controller.http;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private final static String LOGIN_BIRTH_PARAM_NAME = "login";
    private final static String PASSWORD_BIRTH_PARAM_NAME = "password";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        req.getParameter(LOGIN_BIRTH_PARAM_NAME);
        req.getParameter(PASSWORD_BIRTH_PARAM_NAME);
    }
}
