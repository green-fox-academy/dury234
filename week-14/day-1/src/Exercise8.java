import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise8 {

    public static String toString(List<Character> source) {
        return source.stream()
                .map(Objects::toString)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('L', 'o', 'r', 'e', 'm', ' ', 'i', 'p', 's', 'u', 'm');

        String expectedOutput = "Lorem ipsum";

        System.out.println(toString(characters));
    }
}
