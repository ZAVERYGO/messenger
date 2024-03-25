package com.kozich.messenger.dao.api;

import com.kozich.messenger.dao.impl.StatDaoImpl;

public interface StatDao {

    Long getActiveUser();

    void incrementActiveUser();

    void decrementActiveUser();

    Long getAllMessage();

    Long getAllUser();
}
