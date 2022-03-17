import javax.xml.stream.events.Characters;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {

    public static Map<Character, Integer> countChars(String s) {
        return s.codePoints()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(Function.identity(), ch -> 1, (a, b) -> a + b));
    }

    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.";

        System.out.println(countChars(s));
    }
}
