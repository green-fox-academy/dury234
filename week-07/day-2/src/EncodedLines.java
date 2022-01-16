import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void decryptEncodedLines(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        Path pOutput = Paths.get("src/outputDecodedLines.txt");

        try {
            List<String> toDecrypt = Files.readAllLines(pSource);
            List<String> decrypted = new ArrayList<>();

            for (int i = 0; i < toDecrypt.size(); i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < toDecrypt.get(i).length(); j++) {
                    if (toDecrypt.get(i).charAt(j) == ' ') {
                        stringBuilder.append(" ");
                    } else {
                        stringBuilder.append((char)((int)toDecrypt.get(i).charAt(j) - 1));
                    }
                }
                decrypted.add(stringBuilder.toString());
            }

            Files.write(pOutput, decrypted);

        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    public static void main(String[] args) {
        decryptEncodedLines("encoded-lines.txt");

    }
}
