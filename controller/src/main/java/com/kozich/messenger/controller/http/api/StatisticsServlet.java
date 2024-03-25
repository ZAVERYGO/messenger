package com.kozich.messenger.controller.http.api;

import com.kozich.messenger.service.api.StatService;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class StatisticsServlet extends HttpServlet {
    private final StatService statService = ServiceFactorySingleton.getStatService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.write("Количество активных пользователей: " + statService.getActiveUser().getQuantity().toString() + "<br>" +
                        "Количество зарегистрированных пользователей: " + statService.getAllUser().toString() + "<br>" +
                        "Количество сообщений: " + statService.getAllMessage().toString());
    }
}
