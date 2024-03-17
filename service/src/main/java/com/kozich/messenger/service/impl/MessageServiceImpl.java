package com.kozich.messenger.service.impl;

import com.kozich.messenger.dao.api.MessageDao;
import com.kozich.messenger.dao.entity.MessageEntity;
import com.kozich.messenger.service.api.MessageService;
import com.kozich.messenger.service.api.dto.MessageDto;
import com.kozich.messenger.service.mapper.MessageMapper;

import java.time.LocalDateTime;
import java.util.List;

public class MessageServiceImpl implements MessageService {

    private final MessageDao messageDao;

    private final MessageMapper messageMapper;

    public MessageServiceImpl(MessageDao messageDao, MessageMapper messageMapper) {
        this.messageDao = messageDao;
        this.messageMapper = messageMapper;
    }

    @Override
    public void save(MessageDto messageDto) {
        MessageDto messageDto1 = messageDto.setTimeSendMessage(LocalDateTime.now());
        messageDao.save(messageMapper.messageDtoToMessageEntity(messageDto1));
    }

    @Override
    public List<MessageDto> getAllByLogin(String login) {
        List<MessageEntity> allByLogin = messageDao.getAllByLogin(login);
        return messageMapper.messageEntityListToMessageDtoList(allByLogin);
    }
}
