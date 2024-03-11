package com.kozich.voting.controller.http;

import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.api.dto.UserDto;
import com.kozich.voting.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegistrationServlet extends HttpServlet {

    private final static String FIRSTNAME_PARAM_NAME = "firstName";
    private final static String LASTNAME_PARAM_NAME = "lastName";
    private final static String PATRONYMIC_PARAM_NAME = "patronymic";
    private final static String DAY_OF_BIRTH_PARAM_NAME = "dayOfBirth";
    private final static String LOGIN_BIRTH_PARAM_NAME = "login";
    private final static String PASSWORD_BIRTH_PARAM_NAME = "password";

    private final UserService userService = ServiceFactorySingleton.getUserService();

    @Override
    public void init(ServletConfig config) throws ServletException {
        userService.save(new UserDto()
                .setFirstName("Nikita")
                .setLastName("Kozich")
                .setPatronymic("Yurievich")
                .setLogin("ZAVERYGO")
                .setPassword("12345678")
                .setRole("admin"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String firstName   = req.getParameter(FIRSTNAME_PARAM_NAME);
        String lastName    = req.getParameter(LASTNAME_PARAM_NAME);
        String patronymic  = req.getParameter(PATRONYMIC_PARAM_NAME);
        String dayOfBirth  = req.getParameter(DAY_OF_BIRTH_PARAM_NAME);
        String login       = req.getParameter(LOGIN_BIRTH_PARAM_NAME);
        String password    = req.getParameter(PASSWORD_BIRTH_PARAM_NAME);

        UserDto user = new UserDto().setFirstName(firstName)
                        .setLastName(lastName)
                        .setPatronymic(patronymic)
                        .setDayOfBirth(dayOfBirth)
                        .setLogin(login)
                        .setPassword(password)
                        .setRole("user");

        userService.save(user);

    }
}
