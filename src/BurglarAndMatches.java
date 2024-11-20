// https://codeforces.com/contest/16/problem/B

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BurglarAndMatches {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int remainingCapacity = scanner.nextInt();
        int containerCount = scanner.nextInt();

        ArrayList<int[]> containers = new ArrayList<>();

        for (int i = 0; i < containerCount; i++) {
            int boxCount = scanner.nextInt();
            int matchesPerBox = scanner.nextInt();

            containers.add(new int[]{boxCount, matchesPerBox});
        }

        // Sort containers by matches per box in descending order
        Collections.sort(containers, (a, b) -> Integer.compare(b[1], a[1]));

        int totalMatchesStolen = 0;

        for (int[] container : containers) {
            if (remainingCapacity == 0) {
                break; // No more capacity to carry boxes
            }

            int boxesToTake = Math.min(remainingCapacity, container[0]); // Take only what fits
            totalMatchesStolen += boxesToTake * container[1]; // Add matches from these boxes
            remainingCapacity -= boxesToTake; // Update remaining capacity
        }

        System.out.println(totalMatchesStolen);
    }
}
