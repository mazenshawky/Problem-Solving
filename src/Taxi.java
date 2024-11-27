// https://codeforces.com/problemset/problem/158/B

import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numberOfGroups = scanner.nextInt();

        int numberOfOnes = 0, numberOfTwos = 0, numberOfThrees = 0, numberOfFours = 0;

        for (int i = 0; i < numberOfGroups; i++) {
            int groupSize = scanner.nextInt();
            switch (groupSize) {
                case 1 ->
                    numberOfOnes++;
                case 2 ->
                    numberOfTwos++;
                case 3 ->
                    numberOfThrees++;
                case 4 ->
                    numberOfFours++;
            }
        }

        int minTaxis = calculateMinTaxis(numberOfOnes, numberOfTwos, numberOfThrees, numberOfFours);

        System.out.println(minTaxis);
    }

    private static int calculateMinTaxis(int ones, int twos, int threes, int fours) {
        int taxis = 0;

        // Groups of 4 require 1 taxi each
        taxis += fours;

        // Handle ones and threes pairing
        taxis += Math.min(ones, threes);
        int remainingOnes = Math.max(0, ones - threes);
        int remainingThrees = Math.max(0, threes - ones);

        // Handle groups of 2
        taxis += twos / 2; // Pair twos
        boolean hasRemainingTwo = twos % 2 == 1;

        // Handle remaining ones and a single two
        if (hasRemainingTwo) {
            taxis += 1;

            if (remainingOnes > 2) {
                remainingOnes -= 2;
            } else {
                remainingOnes = 0;
            }
        }

        // Handle remaining ones
        taxis += Math.ceil(remainingOnes / 4.0);

        // Handle remaining threes
        taxis += remainingThrees;

        return taxis;
    }
}
