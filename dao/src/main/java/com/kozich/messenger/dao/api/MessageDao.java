package com.kozich.messenger.dao.api;

import com.kozich.messenger.dao.entity.MessageEntity;

import java.util.List;

public interface MessageDao {

    void save(MessageEntity messageEntity);

    List<MessageEntity> getAllByLogin(String login);
}
