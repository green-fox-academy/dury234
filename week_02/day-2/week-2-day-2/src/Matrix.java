import java.sql.Array;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output


        Scanner scanner = new Scanner(System.in);
        System.out.println("Array length:");
        int lengthOfArray = scanner.nextInt();
        int[][] myArray = new int[lengthOfArray][lengthOfArray];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i == j) {
                    myArray[i][j] = 1;
                } else {
                    myArray[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }

    }
}
