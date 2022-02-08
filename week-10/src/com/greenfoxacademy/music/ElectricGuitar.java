package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings, "Electric Guitar", "Twang");
    }

    public ElectricGuitar() {
        super(6, "Electric Guitar", "Twang");
    }

//    @Override
//    void sound() {
//        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
//    }
}
