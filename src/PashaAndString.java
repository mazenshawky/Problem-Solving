// https://codeforces.com/problemset/problem/525/B

import java.util.Scanner;

public class PashaAndString {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        StringBuilder gift = new StringBuilder(scanner.next());
        int numberOfDays = scanner.nextInt();

        // Array to track the reversal operations
        int[] reversals = new int[gift.length() + 1];

        // Record the reversal ranges
        for (int i = 0; i < numberOfDays; i++) {
            int startPosition = scanner.nextInt() - 1;
            reversals[startPosition]++;
            reversals[gift.length() - startPosition]--;
        }

        // Accumulate reversal effects
        int reversalFlag = 0;
        for (int i = 0; i < gift.length() / 2; i++) {
            reversalFlag += reversals[i];
            if (reversalFlag % 2 != 0) {
                // Swap characters to simulate reversal
                int oppositeIndex = gift.length() - i - 1;
                char temp = gift.charAt(i);
                gift.setCharAt(i, gift.charAt(oppositeIndex));
                gift.setCharAt(oppositeIndex, temp);
            }
        }

        System.out.println(gift);
    }
}
