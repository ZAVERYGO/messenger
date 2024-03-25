package com.kozich.messenger.controller.http.ui;

import com.kozich.messenger.service.api.StatService;
import com.kozich.messenger.service.api.dto.StatDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class StatisticsJspServlet extends HttpServlet {

    private final StatService statService = ServiceFactorySingleton.getStatService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StatDto allStat = this.statService.getAllStat();

        req.setAttribute("allStat", allStat);
        req.getRequestDispatcher("/templates/statistics.jsp").forward(req, resp);
    }
}
