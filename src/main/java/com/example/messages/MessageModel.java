package com.example.messages;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageModel {

    private String author;
    private LocalDateTime timestamp;
    private String message;

    public MessageModel(String author, String message) {
        this.author = author;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public MessageModel() {
    }
}
