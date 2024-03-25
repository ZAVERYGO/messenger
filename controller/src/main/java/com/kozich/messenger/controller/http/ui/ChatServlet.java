package com.kozich.messenger.controller.http.ui;

import com.kozich.messenger.controller.utils.SessionUtils;
import com.kozich.messenger.service.api.MessageService;
import com.kozich.messenger.service.api.dto.MessageDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class ChatServlet extends HttpServlet {
    private final MessageService messageService = ServiceFactorySingleton.getMessageService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<MessageDto> messages = this.messageService.getAllByLogin(SessionUtils.loadUser(req.getSession()));

        req.setAttribute("messages", messages);

        req.getRequestDispatcher("/templates/chats.jsp").forward(req, resp);
    }
}
