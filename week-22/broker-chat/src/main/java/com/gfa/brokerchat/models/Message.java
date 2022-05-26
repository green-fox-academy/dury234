package com.gfa.brokerchat.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Data
public class Message {

    private String content;
    private LocalDateTime created;
    private UserInfoDto author;

    @JsonProperty("created")
    public void setCreated(String data) {
        try {
            this.created = LocalDateTime.parse(data, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        } catch (DateTimeParseException e) {
            this.created = ZonedDateTime.parse(data, DateTimeFormatter.ISO_ZONED_DATE_TIME)
                    .toLocalDateTime();
        }
    }
}
