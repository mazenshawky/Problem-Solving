// https://codeforces.com/problemset/problem/371/B

import java.util.Scanner;

public class FoxDividingCheese {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int[] factorCountA = new int[3]; // Count of factors 2, 3, and 5 for cheese A
        int[] factorCountB = new int[3]; // Count of factors 2, 3, and 5 for cheese B

        int cheeseA = scanner.nextInt();
        int cheeseB = scanner.nextInt();

        if (cheeseA == cheeseB) {
            System.out.println("0");
            return;
        }

        // Factorizing cheeseA by prime factors 2, 3, and 5
        while (cheeseA > 1) {
            if (cheeseA % 2 == 0) {
                factorCountA[0]++;
                cheeseA /= 2;
            } else if (cheeseA % 3 == 0) {
                factorCountA[1]++;
                cheeseA /= 3;
            } else if (cheeseA % 5 == 0) {
                factorCountA[2]++;
                cheeseA /= 5;
            } else {
                break;
            }
        }

        // Factorizing cheeseB by prime factors 2, 3, and 5
        while (cheeseB > 1) {
            if (cheeseB % 2 == 0) {
                factorCountB[0]++;
                cheeseB /= 2;
            } else if (cheeseB % 3 == 0) {
                factorCountB[1]++;
                cheeseB /= 3;
            } else if (cheeseB % 5 == 0) {
                factorCountB[2]++;
                cheeseB /= 5;
            } else {
                break;
            }
        }

        // If the remaining parts of cheeseA and cheeseB are different (not equal 1)
        if (cheeseA != cheeseB) {
            System.out.println("-1");
            return;
        }

        // Calculating the total operations to balance the factors
        int operations = Math.abs(factorCountA[0] - factorCountB[0])
                + Math.abs(factorCountA[1] - factorCountB[1])
                + Math.abs(factorCountA[2] - factorCountB[2]);

        System.out.println(operations);
    }
}
