package com.gfa.backendapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {

    private int received;
    private int result;

    public Doubling(int received) {
        this.received = received;
        result = 2 * received;
    }

//    @Override
//    public String toString() {
//        return "Doubling{" +
//                "received=" + received +
//                ", result=" + result +
//                '}';
//    }
}
