package com.gfa.brokerchat.models;

import lombok.Data;

import java.util.List;

@Data
public class MessagesResponseDto {

    private List<Message> messages;
    private Channel channel;

}
