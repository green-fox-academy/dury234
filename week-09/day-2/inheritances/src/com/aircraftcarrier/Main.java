package com.aircraftcarrier;

public class Main {
    public static void main(String[] args) throws Exception {
        Aircraft aircraft1 = new Aircraft(AircraftType.F35);
        Aircraft aircraft2 = new Aircraft(AircraftType.F16);

        System.out.println("Carrier tests:");
        System.out.println();

        Carrier carrier = new Carrier(300, 5000);
        Carrier carrier2 = new Carrier(300, 1000);
        carrier.add(aircraft1);
        carrier.add(aircraft2);
        carrier.getStatus();
        carrier.fill();


        carrier.getStatus();

        carrier.fight(carrier2);
        carrier2.getStatus();

        carrier.fill();
        carrier.fight(carrier2);
        carrier2.getStatus();

    }
}
