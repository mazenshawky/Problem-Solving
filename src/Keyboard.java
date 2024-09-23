// https://codeforces.com/problemset/problem/474/A

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        char shiftDirection = scanner.next().charAt(0);
        String message = scanner.next();

        StringBuilder originalMessage = new StringBuilder();

        int shift = shiftDirection == 'R' ? -1 : 1;

        for (char ch : message.toCharArray()) {
            int charIndex = keyboard.indexOf(ch);
            originalMessage.append(keyboard.charAt(charIndex + shift));
        }
        System.out.println(originalMessage);
    }
}
