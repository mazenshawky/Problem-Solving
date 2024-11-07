// https://codeforces.com/problemset/problem/276/B

import java.util.Scanner;

public class LittleGirlAndGame2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String text = scanner.next();

        int[] charCounts = new int[26];

        // Count frequencies of each character in the text
        for (char c : text.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int oddFrequency = 0;
        for (int count : charCounts) {
            if (count % 2 != 0) {
                oddFrequency++;
            }
        }

        if (oddFrequency % 2 != 0 || oddFrequency == 0) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

}
