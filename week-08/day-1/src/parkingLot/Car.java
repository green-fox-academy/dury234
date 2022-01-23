package parkingLot;

import java.util.Random;

enum CarType {
    SUV, SEDAN, COUPE, SPORTSCAR, MINIVAN
}

enum CarColor {
    RED, GREEN, BLUE, BLACK, WHITE, PINK, PURPLE
}

public class Car {
    CarType type;
    CarColor color;

    public CarType randomType() {
        CarType[] types = CarType.values();
        int randomIndex = new Random().nextInt(types.length);
        return types[randomIndex];
    }

    public CarColor randomColor() {
        CarColor[] colors = CarColor.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }

    public Car() {
        type = randomType();
        color = randomColor();
    }
}
