import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

    public static void printEachLine(String fileName) {
        Path filePath = Paths.get("src/" + fileName);
        try {
            List<String> content = Files.readAllLines(filePath);

            for (String temp : content) {
                System.out.println(temp);
            }

        } catch (IOException e) {
            System.err.println("Unable to read file: " + fileName);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".

        printEachLine("my-file.txt");

    }
}