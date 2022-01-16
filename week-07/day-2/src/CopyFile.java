import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

    public static boolean copyFile (String source, String target) {
        Path pSource = Paths.get("src/" + source);
        Path pTarget = Paths.get("src/" + target);
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(pSource);
            Files.write(pTarget, content);
            System.out.println(true);
            return true;
        } catch (IOException e) {
            System.err.println(false);
            return false;
        }
    }

    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful
        copyFile("source.txt", "target.txt");
    }
}
