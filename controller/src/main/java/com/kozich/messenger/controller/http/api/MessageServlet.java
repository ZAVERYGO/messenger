package com.kozich.messenger.controller.http.api;

import com.kozich.messenger.service.api.MessageService;
import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.api.dto.MessageDto;
import com.kozich.messenger.service.factory.ServiceFactorySingleton;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MessageServlet extends HttpServlet {

    private final static String RECIPIENT_BIRTH_PARAM_NAME = "recipient";
    private final static String TEXT_BIRTH_PARAM_NAME = "text";

    private final MessageService messageService = ServiceFactorySingleton.getMessageService();

    private final UserService userService = ServiceFactorySingleton.getUserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession(false);

        String login = (String)session.getAttribute("user");

        List<MessageDto> allByLogin = messageService.getAllByLogin(login);

        for (MessageDto messageDto : allByLogin) {
            writer.write("Отправитель" + messageDto.getSender() + "<br>");
            writer.write("Время отправки" + messageDto.getTimeSendMessage() + "<br>");
            writer.write("Текст" + messageDto.getText() + "<br>");
            writer.write("-----------------------------------------------------------------");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String recipient = req.getParameter(RECIPIENT_BIRTH_PARAM_NAME);
        String text = req.getParameter(TEXT_BIRTH_PARAM_NAME);
        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession(false);

        if(userService.getByLogin(recipient) == null){
            throw new IllegalArgumentException("Не существует получатателя");
        }

        String login = (String)session.getAttribute("user");

        MessageDto messageDto = new MessageDto()
                                .setRecipient(recipient)
                                .setSender(login)
                                .setText(text);

        messageService.save(messageDto);

        writer.write("Сообщение сохранено");
        resp.setStatus(HttpServletResponse.SC_CREATED);
    }
}
