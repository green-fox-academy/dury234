package com.company;

import java.util.Scanner;

// Create a function that takes two strings as a parameter
// Returns the starting index where
// the second one is starting in the first one
// Returns `-1` if the second string is not in the first one

// Example:

// should print: `17`
//    System.out.println(subStr("this is what I'm searching in", "searching"));

// should print: `-1`

public class Substr {

    public static int subStr(String input, String q) {


        int a = -1;
        for (int i = 0 ; i < input.length() - q.length() +1; i++) {
            String help = "";
            for (int j = 0; j < q.length(); j++) {

                if (i + j > input.length()-1) {
                   break;
                } else {
                    help = help + input.charAt(i+j);
                }
            }

            if (q.compareTo(help) == 0) {
                a = i;
                break;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert source string:");
        String input = scanner.nextLine();
        System.out.println("Insert string you want to search:");
        String q = scanner.nextLine();
        System.out.println("String you searched starts at index no: " + subStr(input, q));


    }
}
