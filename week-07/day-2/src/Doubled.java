import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void decryptDoubled (String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        Path pOutput = Paths.get("src/output.txt");
        try {
            List<String> toDecrypt = Files.readAllLines(pSource);
            List<String> decrypted = new ArrayList<>();

            for (int i = 0; i < toDecrypt.size(); i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < toDecrypt.get(i).length(); j++) {
                    if (j % 2 == 0) {
                        stringBuilder.append(toDecrypt.get(i).charAt(j));
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
        // Create a method called decryptDoubled() that takes a filename as string as a parameter
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file

        decryptDoubled("duplicated-chars.txt");

    }
}