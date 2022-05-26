package com.gfa.brokerchat.models;

import lombok.Data;

@Data
public class UserInfoDto {
    String username;
    long userId;
    String avatarUrl;
}
