// https://codeforces.com/contest/266/problem/A

import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumOfStonesToRemove = 0;

        int stonesCount = scanner.nextInt();

        String stones = scanner.next();
        for (int i = 0; i < stonesCount - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                minNumOfStonesToRemove++;
            }
        }
        System.out.println(minNumOfStonesToRemove);
    }
}
