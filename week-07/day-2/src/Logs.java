import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static List<String> getIPAdresses(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        List<String> adresses = new ArrayList<>();
        try {
            List<String> content = Files.readAllLines(pSource);


            for (int i = 0; i < content.size(); i++) {
                List<String> splitLine = List.of(content.get(i).split(" "));

                if (!(adresses.contains(splitLine.get(8)))) {
                    adresses.add(splitLine.get(8));
                }
            }

        } catch (IOException e) {
            System.err.println("File not found");
        }
        return adresses;
    }

    public static double getPostRatio(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        int postNumber = 0;
        int getNumber = 0;
        try {
            List<String> content = Files.readAllLines(pSource);


            for (int i = 0; i < content.size(); i++) {
                List<String> splitLine = List.of(content.get(i).split(" "));

                if (splitLine.get(11).equals("POST")) {
                    postNumber++;
                } else {
                    getNumber++;
                }
            }

        } catch (IOException e) {
            System.err.println("File not found");
        }

        return (double) postNumber / getNumber;
    }

    public static void main(String[] args) {
        // Read all data from 'log.txt'
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses
        // Write a function that returns the GET / POST request ratio

        System.out.println(getIPAdresses("log.txt"));
        System.out.println("POST to GET request ratio: " + getPostRatio("log.txt"));
    }
}
