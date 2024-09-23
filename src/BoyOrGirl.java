// https://codeforces.com/problemset/problem/236/A

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String username = scanner.next();

        HashSet<Character> distinctChars = new HashSet<>();

        for (char ch : username.toCharArray()) {
            distinctChars.add(ch);
        }

        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
