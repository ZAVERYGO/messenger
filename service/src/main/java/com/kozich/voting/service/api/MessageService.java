package com.kozich.voting.service.api;

import com.kozich.voting.service.api.dto.MessageDto;

import java.util.List;

public interface MessageService {
    void save(MessageDto messageDto);

    List<MessageDto> getAllByLogin(String login);
}
