package com.kozich.voting.service.factory;

import com.kozich.voting.dao.factory.DaoFactory;
import com.kozich.voting.service.api.MessageService;
import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.impl.MessageServiceImpl;
import com.kozich.voting.service.impl.UserServiceImpl;
import com.kozich.voting.service.mapper.MessageMapper;
import com.kozich.voting.service.mapper.UserMapper;

public class ServiceFactorySingleton {
    private volatile static UserService userService;

    private volatile static MessageService messageService;


    public static UserService getUserService(){
        if(userService == null){
            synchronized (ServiceFactorySingleton.class){
                if(userService == null){
                    userService = new UserServiceImpl(DaoFactory.getUserDao(), new UserMapper());
                }
            }
        }
        return userService;
    }

    public static MessageService getMessageService(){
        if(messageService == null){
            synchronized (ServiceFactorySingleton.class){
                if(messageService == null){
                    messageService = new MessageServiceImpl(DaoFactory.getMessageDao(), new MessageMapper());
                }
            }
        }
        return messageService;
    }
}
