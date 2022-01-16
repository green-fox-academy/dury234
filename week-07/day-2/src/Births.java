import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {

    public static String mostBirthsYear (String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        String result = "";
        Map<String, Integer> numberOfBirthsInYear = new HashMap<>();
        try {
            List<String> content = Files.readAllLines(pSource);

            for (int i = 0; i < content.size(); i++) {
                List<String> splitLine = List.of(content.get(i).split(";"));
                numberOfBirthsInYear.put(splitLine.get(1).substring(0, 4), numberOfBirthsInYear.getOrDefault(splitLine.get(1).substring(0, 4), 0) + 1);
            }
            int max = 0;
            for (Map.Entry<String, Integer> entry : numberOfBirthsInYear.entrySet()) {
                if (entry.getValue() > max) {
                    result = entry.getKey();
                    max = entry.getValue();
                }
            }

        } catch (IOException e) {
            System.err.println("File not found");
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a function that
        // - takes the name of a CSV file as a parameter,
        //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
        // - and returns the year when the most births happened.
        //   - if there were multiple years with the same number of births then return any of them

        // You can find such a CSV file in this directory named births.csv
        // If you pass "births.csv" to your function, the result should be either 2006 or 2016

        System.out.println(mostBirthsYear("births.csv"));
    }
}
