import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {

    public static Map<String, Integer> mostFreqWord(String nameOfFile) throws IOException {
        Path p = Paths.get("src/" + nameOfFile);
        List<String> words = new ArrayList<>();
        try {
            List<String> content = Files.readAllLines(p);

            for (String s : content) {
                List<String> temp = List.of(s.split(" "));
                for (String s1 : temp) {
                    words.add(s1.replaceAll("[^a-zA-Z0-9]", ""));
                }
            }

        } catch (IOException e) {
            throw new IOException("File does not exist");
        }

        return words.stream()
                .collect(Collectors.toMap(s -> s, s -> 1, (a, b) -> a + b));
    }

    public static void main(String[] args) throws IOException {

        System.out.println(mostFreqWord("anand.txt"));

    }
}
