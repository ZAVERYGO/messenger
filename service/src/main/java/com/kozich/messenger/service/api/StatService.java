package com.kozich.messenger.service.api;

import com.kozich.messenger.dao.impl.StatDaoImpl;
import com.kozich.messenger.service.api.dto.StatDto;

public interface StatService {

    Long getActiveUser();

    void incrementActiveUser();

    void decrementActiveUser();

    Long getAllMessage();

    Long getAllUser();

    StatDto getAllStat();
}
