// https://codeforces.com/problemset/problem/492/A

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int cubesGivenCount = scanner.nextInt();

        int totalCubesCount = 0;
        int maxHeight = 0;
        int levelCubes = 1;

        while (true) {
            for (int j = 1; j <= levelCubes; j++) {
                totalCubesCount += j;
            }
            if (totalCubesCount > cubesGivenCount) {
                break;
            }
            levelCubes++;
            maxHeight++;
        }
        System.out.println(maxHeight);
    }
}
