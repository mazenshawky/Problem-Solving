// https://codeforces.com/problemset/problem/218/A

import java.util.Scanner;

public class MountainScenery {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int peaksCount = scanner.nextInt();
        int adjustmentsCount = scanner.nextInt();

        int[] mountainLandscape = new int[2 * peaksCount + 1];

        for (int i = 0; i < mountainLandscape.length; i++) {
            mountainLandscape[i] = scanner.nextInt();
        }

        for (int i = 1; i < mountainLandscape.length - 1 && adjustmentsCount > 0; i += 2) {
            if (mountainLandscape[i] - 1 > mountainLandscape[i - 1] && mountainLandscape[i] - 1 > mountainLandscape[i + 1]) {
                mountainLandscape[i]--;
                adjustmentsCount--;
            }
        }
        for (int i = 0; i < mountainLandscape.length; i++) {
            System.out.print(mountainLandscape[i] + " ");
        }
    }
}
