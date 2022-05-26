package com.gfa.brokerchat.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateInfoDto {

    private String username;
    private String avatarUrl;

}
