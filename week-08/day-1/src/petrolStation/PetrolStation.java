package petrolStation;

public class PetrolStation {
    public static void main(String[] args) {
        Car car = new Car();
        Station station = new Station();

        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);

        station.refill(car);

        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
    }
}
