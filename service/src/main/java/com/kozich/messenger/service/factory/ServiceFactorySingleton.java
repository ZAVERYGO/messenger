package com.kozich.messenger.service.factory;

import com.kozich.messenger.dao.factory.DaoFactory;
import com.kozich.messenger.service.api.MessageService;
import com.kozich.messenger.service.api.StatService;
import com.kozich.messenger.service.api.UserService;
import com.kozich.messenger.service.impl.MessageServiceImpl;
import com.kozich.messenger.service.impl.StatServiceImpl;
import com.kozich.messenger.service.impl.UserServiceImpl;
import com.kozich.messenger.service.mapper.MessageMapper;
import com.kozich.messenger.service.mapper.UserMapper;

public class ServiceFactorySingleton {
    private volatile static UserService userService;
    private volatile static MessageService messageService;
    private volatile static StatService statService;


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

    public static StatService getStatService(){
        if(statService == null){
            synchronized (ServiceFactorySingleton.class){
                if(statService == null){
                    statService = new StatServiceImpl(DaoFactory.getStatDao());
                }
            }
        }
        return statService;
    }
}
