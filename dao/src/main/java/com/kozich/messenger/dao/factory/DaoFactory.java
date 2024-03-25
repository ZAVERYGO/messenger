package com.kozich.messenger.dao.factory;

import com.kozich.messenger.dao.api.MessageDao;
import com.kozich.messenger.dao.api.StatDao;
import com.kozich.messenger.dao.api.UserDao;
import com.kozich.messenger.dao.impl.MessageDaoImpl;
import com.kozich.messenger.dao.impl.StatDaoImpl;
import com.kozich.messenger.dao.impl.UserDaoImpl;

public class DaoFactory {
    private volatile static UserDao userDao;

    private volatile static MessageDao messageDao;

    private volatile static StatDao statDao;

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

    public static StatDao getStatDao(){
        if(statDao == null){
            synchronized (DaoFactory.class){
                if(statDao == null){
                    statDao = new StatDaoImpl(getUserDao(), getMessageDao());
                }
            }
        }
        return statDao;
    }

}
