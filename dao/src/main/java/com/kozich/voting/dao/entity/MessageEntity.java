package com.kozich.voting.dao.entity;

import java.time.LocalDateTime;

public class MessageEntity {

    private LocalDateTime timeSendMessage;

    private String sender;

    private String recipient;

    private String text;

    public LocalDateTime getTimeSendMessage() {
        return timeSendMessage;
    }

    public MessageEntity setTimeSendMessage(LocalDateTime timeSendMessage) {
        this.timeSendMessage = timeSendMessage;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public MessageEntity setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public String getRecipient() {
        return recipient;
    }

    public MessageEntity setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageEntity setText(String text) {
        this.text = text;
        return this;
    }

}
