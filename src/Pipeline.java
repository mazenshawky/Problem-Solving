// https://codeforces.com/contest/287/problem/B

import java.util.Scanner;

public class Pipeline {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        long pipesNeededCount = scanner.nextLong();
        long availableSplittersCount = scanner.nextLong();

        if (pipesNeededCount == 1) {
            System.out.println(0);
        } else if (pipesNeededCount <= availableSplittersCount) {
            System.out.println(1);
        } else {
            // minus one temporary to simplify the algorithm
            pipesNeededCount--;
            availableSplittersCount--;

            if (sum(availableSplittersCount) < pipesNeededCount) {
                System.out.println(-1);
            } else {
                System.out.println(minSplitters(availableSplittersCount, pipesNeededCount));
            }
        }
    }

    public static long sum(long number) {
        return (number * (number + 1)) / 2;
    }

    public static long sum(long start, long end) {
        if (start <= 1) {
            return sum(end);
        }
        return sum(end) - sum(start - 1);
    }

    public static long minSplitters(long availableSplittersCount, long pipesNeededCount) {
        long start = 1;
        long end = availableSplittersCount;

        while (start < end) {
            long mid = (start + end) / 2;
            long result = sum(mid, availableSplittersCount);

            if (result == pipesNeededCount) {
                // add back the minused one
                return availableSplittersCount - mid + 1;
            }

            if (result > pipesNeededCount) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        // add back the minused one and add a more one to calculate the one number left to be added from the start of the sequence
        return availableSplittersCount - start + 2;
    }
}
