package com.gfa.backendapi.model;

import lombok.Data;

import java.util.List;

@Data
public class Entries {
    private List<Log> entries;
    private int entry_count;

    public Entries(List<Log> entries) {
        this.entries = entries;
        entry_count = entries.size();
    }
}
