// https://codeforces.com/problemset/problem/680/B

import java.util.Scanner;

public class BearAndFindingCriminals {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numberOfCities = scanner.nextInt();
        int limakPosition = scanner.nextInt();

        int[] criminals = new int[numberOfCities + 1];

        int[] distances = new int[numberOfCities];

        int numberOfCaughtCriminals = 0;

        for (int i = 1; i <= numberOfCities; i++) {
            criminals[i] = scanner.nextInt();
            if (i == limakPosition && criminals[i] == 1) {
                numberOfCaughtCriminals++;
            } else if (criminals[i] == 1) {
                distances[Math.abs(limakPosition - i)]++;
            }
        }

        for (int distance = 1; distance < numberOfCities; distance++) {
            if (distances[distance] == 2) {
                numberOfCaughtCriminals += 2;
            } else if (distances[distance] == 1) {
                if (limakPosition - distance <= 0 || limakPosition + distance >= criminals.length) {
                    numberOfCaughtCriminals++;
                }
            }
        }

        System.out.println(numberOfCaughtCriminals);
    }
}
