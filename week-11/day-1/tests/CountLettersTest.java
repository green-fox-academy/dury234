import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    private CountLetters countLetters;

    @BeforeEach
    public void setup() {
        countLetters = new CountLetters();
    }

    @Test
    public void countOneLetter() {
        assertEquals(2, countLetters.countLetters("aaasdfdvf").get('f'));
    }

    @Test
    public void lengthOfResult() {
        assertEquals(5, countLetters.countLetters("aaasdfdvf").size());
    }

    @Test
    public void sumOfLetters() {
        String s = "dsfjndfndjdjdddjnfdjfd";
        Map<Character, Integer> test = countLetters.countLetters(s);
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : test.entrySet()) {
            sum += entry.getValue();
        }
        assertEquals(s.length(), sum);
    }


}