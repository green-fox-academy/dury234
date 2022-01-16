import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void decryptRevOrder(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        Path pOutput = Paths.get("src/outputReversedOrder.txt");

        try {
            List<String> toDecrypt = Files.readAllLines(pSource);
            List<String> decrypted = new ArrayList<>();

            for (int i = toDecrypt.size() - 1; i >= 0; i--) {
                decrypted.add(toDecrypt.get(i));
            }

            Files.write(pOutput, decrypted);

        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        decryptRevOrder("reversed-order.txt");

    }
}