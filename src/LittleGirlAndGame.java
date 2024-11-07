// https://codeforces.com/problemset/problem/276/B

import java.util.HashMap;
import java.util.Scanner;

public class LittleGirlAndGame {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String text = scanner.next();

        HashMap<Character, Integer> chars = new HashMap<>();

        for (char c : text.toCharArray()) {
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }

        int oddFrequency = 0;
        for (int value : chars.values()) {
            if (value % 2 != 0) {
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
