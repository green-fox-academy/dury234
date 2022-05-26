package com.gfa.brokerchat.models;

import lombok.Data;

@Data
public class MessagesRequestDto {

    private Long channelId;
    private String channelSecret;
    private int count;

    public MessagesRequestDto(int count) {
        this.count = count;
    }
}
