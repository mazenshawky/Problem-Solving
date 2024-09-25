// https://codeforces.com/problemset/problem/894/A

import java.util.Scanner;

public class QAQ2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String input = scanner.next();

        int qCount = 0;    // Number of Qs seen so far
        int qaCount = 0;   // Number of "QA" pairs seen so far
        int qaqCount = 0;  // Final count of "QAQ" patterns

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'Q') {
                // Every "QA" seen so far can be extended to "QAQ"
                qaqCount += qaCount;
                // Increment count of Qs
                qCount++;
            } else if (currentChar == 'A') {
                // Every Q sreen so far can be extended to fom "QA"
                qaCount += qCount;
            }
        }

        System.out.println(qaqCount);
    }
}
