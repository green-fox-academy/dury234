package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    Long id;
    String content;

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }
}
