package com.kozich.messenger.controller.http.api;

import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.api.dto.UserDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

public class RegistrationServlet extends HttpServlet {

    private final static String FIRSTNAME_PARAM_NAME = "firstName";
    private final static String LASTNAME_PARAM_NAME = "lastName";
    private final static String PATRONYMIC_PARAM_NAME = "patronymic";
    private final static String DAY_OF_BIRTH_PARAM_NAME = "dayOfBirth";
    private final static String LOGIN_BIRTH_PARAM_NAME = "login";
    private final static String PASSWORD_BIRTH_PARAM_NAME = "password";

    private final UserService userService = ServiceFactorySingleton.getUserService();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName   = req.getParameter(FIRSTNAME_PARAM_NAME);
        String lastName    = req.getParameter(LASTNAME_PARAM_NAME);
        String patronymic  = req.getParameter(PATRONYMIC_PARAM_NAME);
        String dayOfBirth  = req.getParameter(DAY_OF_BIRTH_PARAM_NAME);
        String login       = req.getParameter(LOGIN_BIRTH_PARAM_NAME);
        String password    = req.getParameter(PASSWORD_BIRTH_PARAM_NAME);

        UserDto user = new UserDto().setFirstName(firstName)
                        .setLastName(lastName)
                        .setPatronymic(patronymic)
                        .setDayOfBirth(LocalDate.parse(dayOfBirth))
                        .setLogin(login)
                        .setPassword(password);

        if(userService.getByLogin(login) != null){
            throw new IllegalArgumentException("Логин уже занят");
        }

        userService.save(user);

        resp.getWriter().write("Успешно");
    }
}
