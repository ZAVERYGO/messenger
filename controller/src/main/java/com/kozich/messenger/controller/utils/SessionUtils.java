package com.kozich.messenger.controller.utils;

import com.kozich.messenger.dao.api.UserRole;
import jakarta.servlet.http.HttpSession;
import com.kozich.messenger.service.api.dto.UserDto;

public class SessionUtils {

    private final static String USER_ATTRIBUTE = "user";

    public static void saveUser(HttpSession session, UserDto userDto){
        if(session == null){
            throw new IllegalStateException("Сессия не создана");
        }
        session.setAttribute(USER_ATTRIBUTE, userDto.getLogin());
    }

    public static String loadUser(HttpSession session){
        if(session == null){
            return null;
        }

        String login = (String)session.getAttribute(USER_ATTRIBUTE);

        if(login == null){
            return null;
        }

        return login;
    }
}