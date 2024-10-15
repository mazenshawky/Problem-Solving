// https://codeforces.com/contest/225/problem/A

import java.util.Scanner;

public class DiceTower {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int diceCount = scanner.nextInt();
        int towerTopFace = scanner.nextInt();

        int previousBottomFace = 7 - towerTopFace;
        boolean isPossibleToIdentify = true;

        for (int i = 0; i < diceCount; i++) {
            int firstSideFace = scanner.nextInt();
            int secondSideFace = scanner.nextInt();

            if (previousBottomFace == firstSideFace
                    || previousBottomFace == secondSideFace
                    || previousBottomFace == (7 - firstSideFace)
                    || previousBottomFace == (7 - secondSideFace)) {
                isPossibleToIdentify = false;
            }

            previousBottomFace = 7 - previousBottomFace;
        }

        System.out.println(isPossibleToIdentify ? "YES" : "NO");
    }
}
