import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";

        List<Character> expectedOutput = Arrays.asList('L', 'I', 'D', 'S', 'A', 'C', 'A', 'E', 'M');

        List<Character> result = s.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> Character.isUpperCase(ch))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
