package parkingLot;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    ArrayList<Car> carsInLot;

    public ParkingLot() {
        carsInLot = new ArrayList<>();
    }

    public void fillParkLot () {
        for (int i = 0; i < 256; i++) {
            Car car = new Car();
            carsInLot.add(car);
        }
    }

    public int sameTypeNumber(CarType type) {
        int count = 0;
        for (int i = 0; i < carsInLot.size(); i++) {
            if (carsInLot.get(i).type == type) {
                count++;
            }
        }
        return count;
    }

    public int sameColorNumber(CarColor color) {
        int count = 0;
        for (int i = 0; i < carsInLot.size(); i++) {
            if (carsInLot.get(i).color == color) {
                count++;
            }
        }
        return count;
    }

    public Car mostFreq() {
        Map<Car, Integer> count = new HashMap<>();

        for (int i = 0; i < carsInLot.size(); i++) {
            count.put(carsInLot.get(i), count.getOrDefault(carsInLot.get(i), 0) + 1);
        }
        Car result = new Car();
        int max = 0;
        for (Map.Entry<Car, Integer> entry : count.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.fillParkLot();


        for (int i = 0; i < parkingLot.carsInLot.size(); i++) {
            System.out.println(parkingLot.carsInLot.get(i).color + " " + parkingLot.carsInLot.get(i).type);
        }

        System.out.println();
        System.out.println("Coupe: " + parkingLot.sameTypeNumber(CarType.COUPE));
        System.out.println("Sedan: " + parkingLot.sameTypeNumber(CarType.SEDAN));
        System.out.println("SUV: " + parkingLot.sameTypeNumber(CarType.SUV));
        System.out.println("Sportscar: " + parkingLot.sameTypeNumber(CarType.SPORTSCAR));
        System.out.println("Minivan: " + parkingLot.sameTypeNumber(CarType.MINIVAN));

        System.out.println();

        System.out.println("Black: " + parkingLot.sameColorNumber(CarColor.BLACK));
        System.out.println("White: " + parkingLot.sameColorNumber(CarColor.WHITE));
        System.out.println("Red: " + parkingLot.sameColorNumber(CarColor.RED));
        System.out.println("Green: " + parkingLot.sameColorNumber(CarColor.GREEN));
        System.out.println("Blue: " + parkingLot.sameColorNumber(CarColor.BLUE));
        System.out.println("Pink: " + parkingLot.sameColorNumber(CarColor.PINK));
        System.out.println("Purple: " + parkingLot.sameColorNumber(CarColor.PURPLE));

        System.out.println();

        System.out.println("Most frequent car type and color is: " + parkingLot.mostFreq().color + " " + parkingLot.mostFreq().type);

    }
}
