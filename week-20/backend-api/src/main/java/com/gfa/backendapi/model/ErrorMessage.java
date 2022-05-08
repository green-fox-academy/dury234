package com.gfa.backendapi.model;

import lombok.Data;

@Data
public class ErrorMessage {
    private String error;

    public ErrorMessage(String error) {
        this.error = error;
    }
}
