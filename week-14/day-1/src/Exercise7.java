import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

    public static List<String> startWith(char ch, List<String> source) {
        return source.stream()
                .filter(s -> s.startsWith(Character.toString(ch)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> expectedOutput;
        expectedOutput = Arrays.asList("ROME"); // for 'R'
        expectedOutput = Arrays.asList("NAIROBI", "NEW DELHI"); // for 'N'

        System.out.println(startWith('N', cities));
    }
}
