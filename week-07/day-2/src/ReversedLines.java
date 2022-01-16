import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void decryptRevLines(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        Path pOutput = Paths.get("src/outputReversed.txt");

        try {
            List<String> toDecrypt = Files.readAllLines(pSource);
            List<String> decrypted = new ArrayList<>();

            for (int i = 0; i < toDecrypt.size(); i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = toDecrypt.get(i).length() - 1; j >= 0; j--) {
                    stringBuilder.append(toDecrypt.get(i).charAt(j));
                }
                decrypted.add(stringBuilder.toString());
            }

            Files.write(pOutput, decrypted);

        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decryptRevLines("reversed-lines.txt");

    }
}