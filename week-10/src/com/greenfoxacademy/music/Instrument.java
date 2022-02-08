package com.greenfoxacademy.music;

public abstract class Instrument {
    protected final String name;
    protected final String sound;

    protected Instrument(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    protected abstract void play();
}
