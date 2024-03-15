package com.kozich.voting.dao.factory;

import com.kozich.voting.dao.api.MessageDao;
import com.kozich.voting.dao.api.UserDao;
import com.kozich.voting.dao.impl.MessageDaoImpl;
import com.kozich.voting.dao.impl.UserDaoImpl;

public class DaoFactory {
    private volatile static UserDao userDao;

    private volatile static MessageDao messageDao;

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

    public static MessageDao getMessageDao(){
        if(messageDao == null){
            synchronized (DaoFactory.class){
                if(messageDao == null){
                    messageDao = new MessageDaoImpl();
                }
            }
        }
        return messageDao;
    }

}
