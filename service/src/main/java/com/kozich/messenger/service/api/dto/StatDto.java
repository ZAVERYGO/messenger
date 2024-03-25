package com.kozich.messenger.service.api.dto;

import com.kozich.messenger.dao.impl.StatDaoImpl;

import java.util.concurrent.atomic.AtomicLong;

public class StatDto {

    private Long activeUser;
    private Long allUser;
    private Long allMessage;

    public Long getActiveUser() {
        return activeUser;
    }

    public StatDto setActiveUser(Long activeUser) {
        this.activeUser = activeUser;
        return this;
    }

    public Long getAllUser() {
        return allUser;
    }

    public StatDto setAllUser(Long allUser) {
        this.allUser = allUser;
        return this;
    }

    public Long getAllMessage() {
        return allMessage;
    }

    public StatDto setAllMessage(Long allMessage) {
        this.allMessage = allMessage;
        return this;
    }
}
