import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

    public static List<String> mostCommonNumbers (String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        Map<String, Integer> lotteryNumbers = new HashMap<>();
        try {
            List<String> content = Files.readAllLines(pSource);

            for (int i = 0; i < content.size(); i++) {
                List<String> splitLine = List.of(content.get(i).split(";"));
                lotteryNumbers.put(splitLine.get(1).substring(0, 4), lotteryNumbers.getOrDefault(splitLine.get(1).substring(0, 4), 0) + 1);
            }
            int max = 0;
            for (Map.Entry<String, Integer> entry : lotteryNumbers.entrySet()) {
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
        // Create a method that find the 5 most common lottery numbers in lottery.csv
    }
}
