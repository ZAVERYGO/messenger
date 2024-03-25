package com.kozich.messenger.service.impl;

import com.kozich.messenger.dao.api.StatDao;
import com.kozich.messenger.dao.impl.StatDaoImpl;
import com.kozich.messenger.service.api.StatService;
import com.kozich.messenger.service.api.dto.StatDto;


public class StatServiceImpl implements StatService {

    private final StatDao statDao;

    public StatServiceImpl(StatDao statDao) {
        this.statDao = statDao;
    }

    @Override
    public Long getActiveUser() {
        return statDao.getActiveUser();
    }

    @Override
    public void incrementActiveUser() {
        statDao.incrementActiveUser();
    }

    @Override
    public void decrementActiveUser() {
        statDao.decrementActiveUser();
    }

    @Override
    public Long getAllMessage() {
        return statDao.getAllMessage();
    }

    @Override
    public Long getAllUser() {
        return statDao.getAllUser();
    }

    @Override
    public StatDto getAllStat() {
        Long activeUser = statDao.getActiveUser();
        Long allMessage = statDao.getAllMessage();
        Long allUser = statDao.getAllUser();

        return new StatDto()
                .setActiveUser(activeUser)
                .setAllMessage(allMessage)
                .setAllUser(allUser);

    }


}
