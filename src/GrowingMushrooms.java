// https://codeforces.com/contest/186/problem/B

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GrowingMushrooms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParticipants = scanner.nextInt();
        int timeBeforeBreak = scanner.nextInt();
        int timeAfterBreak = scanner.nextInt();
        int reducePercentage = scanner.nextInt();

        List<List<Object>> results = new ArrayList<>();

        // Collect results for each participant
        for (int i = 0; i < numberOfParticipants; i++) {
            int firstSpeed = scanner.nextInt();
            int secondSpeed = scanner.nextInt();

            // Calculate first scenario
            double firstScenario = (firstSpeed * timeBeforeBreak)
                    - (firstSpeed * timeBeforeBreak * reducePercentage * 0.01)
                    + (secondSpeed * timeAfterBreak);

            // Calculate second scenario
            double secondScenario = (secondSpeed * timeBeforeBreak)
                    - (secondSpeed * timeBeforeBreak * reducePercentage * 0.01)
                    + (firstSpeed * timeAfterBreak);

            double maxGrowth = Math.max(firstScenario, secondScenario);

            // Add participant result (ID and max growth)
            results.add(Arrays.asList(i + 1, maxGrowth));
        }

        // Sort results based on the growth value in descending order
        results.sort((r1, r2) -> Double.compare((Double) r2.get(1), (Double) r1.get(1)));

        for (var result : results) {
            System.out.printf("%d %.2f%n", result.get(0), result.get(1));
        }
    }
}
