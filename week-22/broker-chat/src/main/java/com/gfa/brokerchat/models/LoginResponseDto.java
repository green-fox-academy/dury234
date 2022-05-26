package com.gfa.brokerchat.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LoginResponseDto {

    String apiKey;
    String username;
    String avatarUrl;

}
