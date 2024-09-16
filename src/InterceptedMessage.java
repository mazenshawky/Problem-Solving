// https://codeforces.com/problemset/problem/950/B

import java.util.Scanner;

public class InterceptedMessage {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int maxmNumOfFiles = 0;

        int firstMessageBlocksCount = scanner.nextInt();
        int secondMessageBlocksCount = scanner.nextInt();

        int[] firstMessageBlocks = new int[firstMessageBlocksCount];
        int[] secondMessageBlocks = new int[secondMessageBlocksCount];

        int firstMessageBlocksSum = 0, secondMessageBlocksSum = 0, totalSum = 0;

        for (int i = 0; i < firstMessageBlocksCount; i++) {
            firstMessageBlocks[i] = scanner.nextInt();
            totalSum += firstMessageBlocks[i];
        }

        for (int i = 0; i < secondMessageBlocksCount; i++)
            secondMessageBlocks[i] = scanner.nextInt();

        firstMessageBlocksSum = totalSum;
        secondMessageBlocksSum = totalSum;

        int i = 0;
        int j = 0;
        while (firstMessageBlocksSum != 0 && secondMessageBlocksSum != 0) {
            if (firstMessageBlocksSum == secondMessageBlocksSum) {
                if (i != firstMessageBlocksCount - 1 && firstMessageBlocksSum != totalSum)
                    i++;

                if (j != secondMessageBlocksCount - 1 && firstMessageBlocksSum != totalSum)
                    j++;

                firstMessageBlocksSum -= firstMessageBlocks[i];
                secondMessageBlocksSum -= secondMessageBlocks[j];
                maxmNumOfFiles++;
            }

            if (firstMessageBlocksSum > secondMessageBlocksSum) {
                if (i != firstMessageBlocksCount - 1)
                    i++;
                firstMessageBlocksSum -= firstMessageBlocks[i];

            } else if (firstMessageBlocksSum < secondMessageBlocksSum) {
                if (j != secondMessageBlocksCount - 1)
                    j++;
                secondMessageBlocksSum -= secondMessageBlocks[j];
            }
        }
        System.out.println(maxmNumOfFiles);
    }
}
