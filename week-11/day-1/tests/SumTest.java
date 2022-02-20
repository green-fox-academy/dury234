import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum sum;

    @BeforeEach
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void multipleElementsSum() {
        assertEquals(10, sum.sum(Arrays.asList(2, 3, 5)));
    }

    @Test
    public void emptySum() {
        assertEquals(0, sum.sum(Arrays.asList()));
    }

    @Test
    public void oneElementSum() {
        assertEquals(8, sum.sum(Arrays.asList(8)));
    }

    @Test
    public void nullSum() {
        assertEquals(0, sum.sum(null));
    }



}