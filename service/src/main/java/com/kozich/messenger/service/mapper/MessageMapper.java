package com.kozich.messenger.service.mapper;

import com.kozich.messenger.dao.entity.MessageEntity;
import com.kozich.messenger.service.api.dto.MessageDto;

import java.util.ArrayList;
import java.util.List;

public class MessageMapper {
    public MessageEntity messageDtoToMessageEntity(MessageDto messageDto){
        if (messageDto == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setTimeSendMessage(messageDto.getTimeSendMessage() )
                .setSender(messageDto.getSender() )
                .setRecipient(messageDto.getRecipient() )
                .setText(messageDto.getText() );

        return messageEntity;
    }

    public MessageDto messageEntityToMessageDto(MessageEntity messageEntity){
        if (messageEntity == null ) {
            return null;
        }

        MessageDto messageDto = new MessageDto();

        messageDto.setTimeSendMessage(messageEntity.getTimeSendMessage() )
                .setSender(messageEntity.getSender() )
                .setRecipient(messageEntity.getRecipient() )
                .setText(messageEntity.getText() );

        return messageDto;
    }

    public List<MessageEntity> messageDtoListToMessageEntityList(List<MessageDto> messageDtoList){
        if (messageDtoList == null ) {
            return null;
        }

        List<MessageEntity> messageEntityList = new ArrayList<>();

        for (MessageDto message : messageDtoList) {
            messageEntityList.add(messageDtoToMessageEntity(message));
        }
        return messageEntityList;
    }

    public List<MessageDto> messageEntityListToMessageDtoList(List<MessageEntity> messageEntityList){
        if (messageEntityList == null ) {
            return null;
        }

        List<MessageDto> messageDtoList = new ArrayList<>();

        for (MessageEntity message : messageEntityList) {
            messageDtoList.add(messageEntityToMessageDto(message));
        }
        return messageDtoList;
    }
}
