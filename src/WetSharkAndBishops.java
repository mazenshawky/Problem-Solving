// https://codeforces.com/problemset/problem/621/B

import java.util.HashMap;
import java.util.Scanner;

public class WetSharkAndBishops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bishopsCount = scanner.nextInt();
        HashMap<Integer, Integer> mainDiagonalCounts = new HashMap<>();
        HashMap<Integer, Integer> antiDiagonalCounts = new HashMap<>();

        for (int i = 0; i < bishopsCount; i++) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            int mainDiagonalKey = row - column;
            int antiDiagonalKey = row + column;

            mainDiagonalCounts.put(mainDiagonalKey, mainDiagonalCounts.getOrDefault(mainDiagonalKey, 0) + 1);
            antiDiagonalCounts.put(antiDiagonalKey, antiDiagonalCounts.getOrDefault(antiDiagonalKey, 0) + 1);
        }

        int bishopsWhoAttackCount = 0;

        for (int count : mainDiagonalCounts.values()) {
            if (count > 1) {
                bishopsWhoAttackCount += count * (count - 1) / 2;
            }
        }

        for (int count : antiDiagonalCounts.values()) {
            if (count > 1) {
                bishopsWhoAttackCount += count * (count - 1) / 2;
            }
        }

        System.out.println(bishopsWhoAttackCount);
    }
}
