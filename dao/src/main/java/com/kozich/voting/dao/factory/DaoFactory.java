package com.kozich.voting.dao.factory;

import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.impl.UserDaoImpl;

public class DaoFactory {
    private volatile static UserDao userDao;

    public static UserDao getUserDao(){
        if(userDao == null){
            synchronized (DaoFactory.class){
                if(userDao == null){
                    userDao = new UserDaoImpl();
                }
            }
        }
        return userDao;
    }

}
