package com.kozich.voting.service.api.dto;

import java.time.LocalDateTime;

public class MessageDto {

    private LocalDateTime timeSendMessage;

    private String sender;

    private String recipient;

    private String text;

    public LocalDateTime getTimeSendMessage() {
        return timeSendMessage;
    }

    public MessageDto setTimeSendMessage(LocalDateTime timeSendMessage) {
        this.timeSendMessage = timeSendMessage;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public MessageDto setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public MessageDto setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageDto setText(String text) {
        this.text = text;
        return this;
    }

}
