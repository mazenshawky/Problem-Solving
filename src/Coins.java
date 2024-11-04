// https://codeforces.com/contest/47/problem/B

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int[] bigger = new int[3];  // Index 0 for A, 1 for B, 2 for C
        int[] smaller = new int[3]; // Index 0 for A, 1 for B, 2 for C

        for (int i = 0; i < 3; i++) {
            String weight = scanner.nextLine();
            char first = weight.charAt(0);
            char second = weight.charAt(2);
            boolean isGreater = weight.charAt(1) == '>';

            // Increase counters based on the direction of the relationship
            if (isGreater) {
                incrementCounter(first, bigger);
                incrementCounter(second, smaller);
            } else {
                incrementCounter(second, bigger);
                incrementCounter(first, smaller);
            }
        }

        // Check if the results are possible
        if (Math.abs(bigger[0] - smaller[0]) + Math.abs(bigger[1] - smaller[1]) + Math.abs(bigger[2] - smaller[2]) != 4) {
            System.out.println("Impossible");
        } else {
            String output = buildOutput(smaller);
            System.out.println(output);
        }
    }

    // Helper method to increment the appropriate counter for a given character
    private static void incrementCounter(char ch, int[] counter) {
        switch (ch) {
            case 'A' ->
                counter[0]++;
            case 'B' ->
                counter[1]++;
            case 'C' ->
                counter[2]++;
        }
    }

    // Builds the output string based on the smaller array values
    private static String buildOutput(int[] smaller) {
        StringBuilder output = new StringBuilder(3);
        output.append(findCharWithValue(smaller, 2));  // Finds character with 2 occurrences
        output.append(findCharWithValue(smaller, 1));  // Finds character with 1 occurrence
        output.append(findCharWithValue(smaller, 0));  // Finds character with 0 occurrences
        return output.toString();
    }

    // Helper method to find character by the value in smaller array
    private static char findCharWithValue(int[] smaller, int value) {
        if (smaller[0] == value) {
            return 'A';
        }
        if (smaller[1] == value) {
            return 'B';
        }
        return 'C';
    }
}
