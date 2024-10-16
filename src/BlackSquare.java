// https://codeforces.com/problemset/problem/431/A

import java.util.Scanner;

public class BlackSquare {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int[] calories = new int[4];

        for (int i = 0; i < calories.length; i++) {
            calories[i] = scanner.nextInt();
        }

        int totalWastedCalories = 0;
        String blackSquareAppearanceSequence = scanner.next();

        for (char c : blackSquareAppearanceSequence.toCharArray()) {
            switch (c) {
                case '1' ->
                    totalWastedCalories += calories[0];
                case '2' ->
                    totalWastedCalories += calories[1];
                case '3' ->
                    totalWastedCalories += calories[2];
                case '4' ->
                    totalWastedCalories += calories[3];
            }
        }

        System.out.println(totalWastedCalories);
    }
}
