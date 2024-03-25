package com.kozich.messenger.dao.impl;

import com.kozich.messenger.dao.api.MessageDao;
import com.kozich.messenger.dao.api.StatDao;
import com.kozich.messenger.dao.api.UserDao;

import java.util.concurrent.atomic.AtomicLong;

public class StatDaoImpl implements StatDao {

    private AtomicLong activeUser;
    private final UserDao userDao;
    private final MessageDao messageDao;

    public StatDaoImpl(UserDao userDao, MessageDao messageDao) {
        activeUser = new AtomicLong(0);
        this.userDao = userDao;
        this.messageDao = messageDao;
    }

    @Override
    public Long getActiveUser() {
        return activeUser.get();
    }
    public void incrementActiveUser() {
        activeUser.incrementAndGet();
    }


    public void decrementActiveUser() {
        activeUser.decrementAndGet();
    }

    @Override
    public Long getAllMessage() {
        return messageDao.getQuantity();
    }

    @Override
    public Long getAllUser() {
        return userDao.getQuantity();
    }

}
