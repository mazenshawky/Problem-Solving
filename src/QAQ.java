// https://codeforces.com/problemset/problem/894/A

import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String input = scanner.next();

        char[] inputChars = input.toCharArray();

        int patternCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (inputChars[i] == 'Q') {
                for (int j = i + 1; j < input.length(); j++) {
                    if (inputChars[j] == 'A') {
                        for (int k = j + 1; k < input.length(); k++) {
                            if (inputChars[k] == 'Q') {
                                patternCount++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(patternCount);
    }
}
