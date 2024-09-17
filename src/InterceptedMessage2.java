// https://codeforces.com/problemset/problem/950/B

import java.util.Scanner;

public class InterceptedMessage2 {

    enum SumState {
        equal, firstGreater, secondGreater
    };

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int maxmNumOfFiles = 0;

        int firstMessageBlocksCount = scanner.nextInt();
        int secondMessageBlocksCount = scanner.nextInt();

        int[] firstMessageBlocks = new int[firstMessageBlocksCount];
        int[] secondMessageBlocks = new int[secondMessageBlocksCount];

        for (int i = 0; i < firstMessageBlocksCount; i++)
            firstMessageBlocks[i] = scanner.nextInt();

        for (int i = 0; i < secondMessageBlocksCount; i++)
            secondMessageBlocks[i] = scanner.nextInt();

        SumState sumState = SumState.equal;
        int i = 0, j = 0, firstMessageBlocksSum = 0, secondMessageBlocksSum = 0;

        while (i < firstMessageBlocksCount && j < secondMessageBlocksCount) {
            if (sumState != SumState.firstGreater) {
                firstMessageBlocksSum += firstMessageBlocks[i];
            }

            if (sumState != SumState.secondGreater) {
                secondMessageBlocksSum += secondMessageBlocks[j];
            }

            if (firstMessageBlocksSum == secondMessageBlocksSum) {
                maxmNumOfFiles++;
                i++;
                j++;
                sumState = SumState.equal;
            } else if (firstMessageBlocksSum > secondMessageBlocksSum) {
                j++;
                sumState = SumState.firstGreater;
            } else {
                i++;
                sumState = SumState.secondGreater;
            }
        }
        System.out.println(maxmNumOfFiles);
    }
}
