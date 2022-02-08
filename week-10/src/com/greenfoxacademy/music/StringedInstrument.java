package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
    final int numberOfStrings;

    protected StringedInstrument(int numberOfStrings, String name, String sound) {
        super(name, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public void sound() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
    };

    @Override
    public void play() {
        sound();
    }
}
