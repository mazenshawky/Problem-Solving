// https://codeforces.com/problemset/problem/122/A

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int[] luckyNumbers = { 4, 7, 44, 77, 47, 74, 444, 777, 477, 474, 447, 744, 747, 774 };

        int number = scanner.nextInt();

        boolean isAlmostLucky = false;
        for (int luckyNumber : luckyNumbers) {
            if (number % luckyNumber == 0) {
                isAlmostLucky = true;
                break;
            }
        }

        if (isAlmostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
