package com.kozich.voting.dao.api;

import com.kozich.voting.dao.entity.MessageEntity;

import java.util.List;

public interface MessageDao {

    void save(MessageEntity messageEntity);

    List<MessageEntity> getAllByLogin(String login);
}
