// https://codeforces.com/problemset/problem/492/A

import java.util.Scanner;

public class VanyaAndCubes2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int cubesGivenCount = scanner.nextInt();

        int totalCubesCount = 0;
        int maxHeight = 0;
        int levelCubes = 1;

        while (totalCubesCount + levelCubes <= cubesGivenCount) {
            totalCubesCount += levelCubes;
            maxHeight++;
            levelCubes += maxHeight + 1;
        }
        System.out.println(maxHeight);
    }
}
