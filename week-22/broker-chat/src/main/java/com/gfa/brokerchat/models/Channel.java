package com.gfa.brokerchat.models;

import lombok.Data;

@Data
public class Channel {

    private long id;
    private String name;
    private String description;
    private String iconUrl;
    private UserInfoDto adnim;
    private String secret;
}
