import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sharpie.Sharpie;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
    private Sharpie sharpie;

    @BeforeEach
    public void setup() {
        sharpie = new Sharpie(5, "red");
    }

    @Test
    public void testGetInkAmount() {
        assertEquals(100, sharpie.getInkAmount());
    }

    @Test
    public void testUse_useOnce() {
        sharpie.use();
        assertEquals(90, sharpie.getInkAmount());
    }

    @Test
    public void testUse_use5Times() {
        for (int i = 0; i < 5; i++) {
            sharpie.use();
        }
        assertEquals(50, sharpie.getInkAmount());
    }

    @Test
    public void testRefill() {
        sharpie.use();
        sharpie.use();
        sharpie.refill();
        assertEquals(100, sharpie.getInkAmount());
    }
}