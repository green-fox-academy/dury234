package com.greenfoxacademy.reservations;

public class Reservations implements Reservationy {
    @Override
    public String getDowBooking() {
        return Day.values()[(int) (Math.random() * 7)].toString();
    }

    @Override
    public String getCodeBooking() {
        String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder resCode = new StringBuilder();
        while (resCode.length() < 9) {
            resCode.append(temp.charAt((int) (Math.random() * temp.length())));
        }
        return resCode.toString();
    }

    public void printInfo() {
        System.out.println("Booking# " + getCodeBooking() + " for " + getDowBooking());
    }

    public static void main(String[] args) {
        Reservations res = new Reservations();
        res.printInfo();
        Reservations res1 = new Reservations();
        res.printInfo();
        Reservations res2 = new Reservations();
        res.printInfo();
    }
}
