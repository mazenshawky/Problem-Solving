// https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int playersCount = scanner.nextInt();

        int[] scores = new int[playersCount];

        int comparablePlace = scanner.nextInt();

        for (int i = 0; i < playersCount; i++) {
            scores[i] = scanner.nextInt();
        }

        int comparableScore = scores[comparablePlace - 1];

        int winnersCount = 0;
        for (int score : scores) {
            if (score >= comparableScore && score != 0) {
                winnersCount++;
            }
        }
        System.out.println(winnersCount);
    }
}
