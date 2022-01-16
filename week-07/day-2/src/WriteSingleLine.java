import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class WriteSingleLine {

    public static void writeSingleLine (String fileName, String content) {
        Path p = Paths.get("src/" + fileName);
        List<String> toWrite = List.of(content);
        try {
            Files.write(p, toWrite, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Unable to write file: " + fileName);
        }
    }

    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        writeSingleLine("my-file.txt", "Juraj Džama");
    }
}