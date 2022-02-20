import animal.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    public void setup() {
        animal = new Animal();
    }

    @Test
    public void playTest_once() {
        animal.play();
        assertEquals(51, animal.getHunger());
        assertEquals(51, animal.getThirst());
    }

    @Test
    public void playTest_threeTimes() {
        animal.play();
        animal.play();
        animal.play();
        assertEquals(53, animal.getHunger());
        assertEquals(53, animal.getThirst());
    }

    @Test
    public void eatTest() {
        animal.eat();
        assertEquals(49, animal.getHunger());
    }

    @Test
    public void drinkTest() {
        animal.drink();
        assertEquals(49, animal.getThirst());
    }
}