package com.gfa.brokerchat.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewMessageReqDto {
    private String content;
    private Long channelId;
    private String channelSecret;
}
