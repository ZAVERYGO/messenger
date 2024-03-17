package com.kozich.messenger.controller.http.api;

import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.api.dto.UserDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    private final static String LOGIN_BIRTH_PARAM_NAME = "login";
    private final static String PASSWORD_BIRTH_PARAM_NAME = "password";

    private final UserService userService = ServiceFactorySingleton.getUserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String login = req.getParameter(LOGIN_BIRTH_PARAM_NAME);
        String password = req.getParameter(PASSWORD_BIRTH_PARAM_NAME);

        UserDto userDto = userService.getByLogin(login);

        if (userDto == null || !userDto.getPassword().equals(password)) {
            throw new IllegalArgumentException("Неверный логин или пароль");
        }
        else {
            HttpSession session = req.getSession();
            session.setAttribute("user", login);
            writer.write("</p> Успешно </p>");

        }

    }
}
