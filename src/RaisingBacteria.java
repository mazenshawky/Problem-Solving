// https://codeforces.com/contest/579/problem/A

import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int goalBacteriaCount = scanner.nextInt();

        int neededBacteriaToPut = 1;

        while (goalBacteriaCount != 1) {
            if (goalBacteriaCount % 2 == 0) {
                goalBacteriaCount /= 2;
            } else {
                goalBacteriaCount--;
                neededBacteriaToPut++;
            }
        }
        System.out.println(neededBacteriaToPut);
    }
}
