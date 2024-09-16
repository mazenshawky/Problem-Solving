// https://codeforces.com/contest/294/problem/A

import java.util.Scanner;

public class ShaassAndOskols {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int wiresCount = scanner.nextInt();

        int[] birdCount = new int[wiresCount + 1];

        for (int i = 1; i <= wiresCount; i++) {
            birdCount[i] = scanner.nextInt();
        }

        int shotsCount = scanner.nextInt();

        for (int i = 0; i < shotsCount; i++) {
            int wireNumber = scanner.nextInt();
            int shottedBirdNumber = scanner.nextInt();

            if (wireNumber != 1) {
                birdCount[wireNumber - 1] += shottedBirdNumber - 1;
            }
            if (wireNumber != wiresCount) {
                birdCount[wireNumber + 1] += birdCount[wireNumber] - shottedBirdNumber;
            }
            birdCount[wireNumber] = 0;
        }

        for (int i = 1; i <= wiresCount; i++) {
            System.out.println(birdCount[i]);
        }
    }
}
