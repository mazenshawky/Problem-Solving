// https://codeforces.com/contest/567/problem/A

import java.util.Scanner;

public class LinelandMail {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int citiesCount = scanner.nextInt();

        int[] citiesCoordinates = new int[citiesCount];

        for (int i = 0; i < citiesCount; i++) {
            citiesCoordinates[i] = scanner.nextInt();
        }

        int firstCity = citiesCoordinates[0];
        int lastCity = citiesCoordinates[citiesCount - 1];

        for (int i = 0; i < citiesCount; i++) {
            int minDistance, maxDistance;

            if (i == 0) {
                minDistance = citiesCoordinates[i + 1] - citiesCoordinates[i];
                maxDistance = lastCity - citiesCoordinates[i];
            } else if (i == citiesCount - 1) {
                minDistance = citiesCoordinates[i] - citiesCoordinates[i - 1];
                maxDistance = citiesCoordinates[i] - firstCity;
            } else {
                minDistance = Math.min(citiesCoordinates[i] - citiesCoordinates[i - 1],
                        citiesCoordinates[i + 1] - citiesCoordinates[i]);
                maxDistance = Math.max(citiesCoordinates[i] - firstCity,
                        lastCity - citiesCoordinates[i]);
            }

            System.out.println(minDistance + " " + maxDistance);
        }
    }
}
