package com.kozich.voting.dao.impl;

import com.kozich.voting.dao.api.MessageDao;
import com.kozich.voting.dao.entity.MessageEntity;

import java.util.ArrayList;
import java.util.List;

public class MessageDaoImpl implements MessageDao {

    private final List<MessageEntity> messageList = new ArrayList<>();
    @Override
    public void save(MessageEntity messageEntity) {
        messageList.add(messageEntity);
    }

    @Override
    public List<MessageEntity> getAllByLogin(String login) {
        List<MessageEntity> list = new ArrayList<>();
        for (MessageEntity messageEntity : messageList) {
            if(messageEntity.getRecipient().equals(login)){
                list.add(messageEntity);
            }
        }
        return list;
    }
}
