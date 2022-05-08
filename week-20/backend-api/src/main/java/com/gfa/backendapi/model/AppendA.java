package com.gfa.backendapi.model;

import lombok.Data;

@Data
public class AppendA {
    private String appended;

    public AppendA(String toAppend) {
        appended = toAppend + "a";
    }
}
