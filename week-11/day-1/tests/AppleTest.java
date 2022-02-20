import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
    private Apple apple;

    @BeforeEach
    public void setup() {
        apple = new Apple();
    }

    @Test
    public void getApple() {
        assertEquals("apple", apple.getApple());
    }

}