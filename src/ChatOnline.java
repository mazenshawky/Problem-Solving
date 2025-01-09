// https://codeforces.com/contest/469/problem/B

import java.util.HashSet;
import java.util.Scanner;

public class ChatOnline {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();

        HashSet<Integer> littleXIntervals = new HashSet<>();

        for (int i = 0; i < p; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            for (int interval = start; interval <= end; interval++) {
                littleXIntervals.add(interval);
            }
        }

        int[][] littleZ = new int[q][2];
        for (int i = 0; i < q; i++) {
            littleZ[i][0] = scanner.nextInt();
            littleZ[i][1] = scanner.nextInt();
        }

        int numberOfSuitableMoments = 0;

        for (int t = l; t <= r; t++) {
            if (hasOverlap(t, littleXIntervals, littleZ)) {
                numberOfSuitableMoments++;
            }
        }

        System.out.println(numberOfSuitableMoments);
    }

    private static boolean hasOverlap(int t, HashSet<Integer> littleXIntervals, int[][] littleZ) {
        for (int[] interval : littleZ) {
            int start = interval[0] + t;
            int end = interval[1] + t;

            for (int moment = start; moment <= end; moment++) {
                if (littleXIntervals.contains(moment)) {
                    return true;
                }
            }
        }

        return false;
    }
}
