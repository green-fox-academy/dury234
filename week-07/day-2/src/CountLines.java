import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void countLines(String fileName) {

        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.

        Path filePath = Paths.get("src/" + fileName);
        try {
            List<String> content = Files.readAllLines(filePath);
            System.out.println(content.size());
        } catch (IOException e) {
            System.err.println(0);
        }

    }

    public static void main(String[] args) {
        countLines("my-file.txt");
    }
}
