import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    private Anagram anagram;

    @BeforeEach
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void isAnagram() {
        assertEquals(true, anagram.isAnagram("abbao", "baoab"));
    }

}