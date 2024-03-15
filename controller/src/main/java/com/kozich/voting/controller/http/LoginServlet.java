package com.kozich.voting.controller.http;

import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.api.dto.UserDto;
import com.kozich.voting.service.factory.ServiceFactorySingleton;
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

        if (userDto == null) {
            writer.write("<p> Неверный логин или пароль </p>");
        }
        else if(userDto.getPassword().equals(password)){
            HttpSession session = req.getSession();
            session.setAttribute("user", login);
            resp.getWriter().write("</p> Успешно </p>");
        }else{
            writer.write("<p> Неверный логин или пароль </p>");
        }

    }
}
