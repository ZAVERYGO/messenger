package com.kozich.voting.controller.http;

import com.kozich.voting.service.api.MessageService;
import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.api.dto.MessageDto;
import com.kozich.voting.service.factory.ServiceFactorySingleton;
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

        if(session == null){
            resp.sendRedirect("http://localhost:8080/messeger-1.0-SNAPSHOT/static/login.html");
        }

        String login = (String)session.getAttribute("user");

        List<MessageDto> allByLogin = messageService.getAllByLogin(login);

        for (MessageDto messageDto : allByLogin) {
            writer.write("<br>" + messageDto.getText() + "</br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String recipient = req.getParameter(RECIPIENT_BIRTH_PARAM_NAME);
        String text = req.getParameter(TEXT_BIRTH_PARAM_NAME);
        PrintWriter writer = resp.getWriter();

        HttpSession session = req.getSession(false);

        if(session == null){
            throw new IllegalArgumentException("Пройдите авторизацию");
        }

        if(!userService.isExists(recipient)){
            writer.write("Не существет пользователя");
            //throw new IllegalArgumentException("Не существет получатателя");
        }

        String login = (String)session.getAttribute("user");

        MessageDto messageDto = new MessageDto()
                                .setRecipient(recipient)
                                .setSender(login)
                                .setText(text);

        messageService.save(messageDto);

        resp.setStatus(HttpServletResponse.SC_CREATED);
    }
}
