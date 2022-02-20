import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {
    public boolean isAnagram(String a, String b) {
        List<Character> word1 = new ArrayList<>();
        List<Character> word2 = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            word1.add(a.charAt(i));
        }

        for (int i = 0; i < b.length(); i++) {
            word2.add(b.charAt(i));
        }

        Collections.sort(word1);
        Collections.sort(word2);

        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }
    }
}
