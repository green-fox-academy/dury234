import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0) + 1);
        }
        return result;
    }
}
