// https://codeforces.com/problemset/problem/456/A

import java.util.Scanner;

public class Laptops {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int laptopsCount = scanner.nextInt();

        int[] prices = new int[laptopsCount];
        int[] qualities = new int[laptopsCount];

        for (int i = 0; i < laptopsCount; i++) {
            prices[i] = scanner.nextInt();
            qualities[i] = scanner.nextInt();

        }

        for (int i = 0; i < laptopsCount; i++) {
            if (qualities[i] > prices[i]) {
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}