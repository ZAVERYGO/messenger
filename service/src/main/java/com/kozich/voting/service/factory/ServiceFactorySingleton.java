package com.kozich.voting.service.factory;

import com.kozich.voting.dao.factory.DaoFactory;
import com.kozich.voting.service.api.UserService;
import com.kozich.voting.service.impl.UserServiceImpl;

public class ServiceFactorySingleton {
    private volatile static UserService userService;

    public static UserService getUserService(){
        if(userService == null){
            synchronized (ServiceFactorySingleton.class){
                if(userService == null){
                    userService = new UserServiceImpl(DaoFactory.getUserDao());
                }
            }
        }
        return userService;
    }
}
