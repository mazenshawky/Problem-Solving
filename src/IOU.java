// https://codeforces.com/contest/376/problem/B

import java.util.Scanner;

public class IOU {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numberOfPeople = scanner.nextInt();
        int numberOfDebts = scanner.nextInt();

        int minimumDebtSum = 0;

        int[] totalOwed = new int[numberOfPeople + 1];
        int[] totalReceived = new int[numberOfPeople + 1];

        for (int i = 0; i < numberOfDebts; i++) {
            int debtor = scanner.nextInt();
            int creditor = scanner.nextInt();
            int amount = scanner.nextInt();

            totalOwed[debtor] += amount;
            totalReceived[creditor] += amount;
        }

        for (int i = 1; i <= numberOfPeople; i++) {
            if (totalReceived[i] < totalOwed[i]) {
                minimumDebtSum += totalOwed[i] - totalReceived[i];
            }
        }

        System.out.println(minimumDebtSum);
    }
}
