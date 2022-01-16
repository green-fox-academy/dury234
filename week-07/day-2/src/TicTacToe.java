import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static String ticTacCheck(List<String> game) {
        for (int i = 0; i < 3; i++) {
            if (game.get(i).charAt(0) == game.get(i).charAt(1) && game.get(i).charAt(0) == game.get(i).charAt(2)) {
                if (game.get(i).charAt(0) == 'O') {
                    return "O";
                } else {
                    return "X";
                }
            } else if (game.get(0).charAt(i) == game.get(1).charAt(i) && game.get(0).charAt(i) == game.get(2).charAt(i)) {
                if (game.get(i).charAt(0) == 'O') {
                    return "O";
                } else {
                    return "X";
                }
            }
        }

        if (game.get(0).charAt(0) == game.get(1).charAt(1) && game.get(0).charAt(0) == game.get(2).charAt(2)) {
            if (game.get(0).charAt(0) == 'O') {
                return "O";
            } else {
                return "X";
            }
        }

        if (game.get(0).charAt(2) == game.get(1).charAt(1) && game.get(0).charAt(2) == game.get(2).charAt(0)) {
            if (game.get(0).charAt(2) == 'O') {
                return "O";
            } else {
                return "X";
            }
        }
        return "Draw";
    }

    public static String ticTacResult(String fileName) {
        Path pSource = Paths.get("src/" + fileName);
        String result = "";
        try {
            List<String> game = Files.readAllLines(pSource);
            result = ticTacCheck(game);
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return result;
    }

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file's content

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }
}