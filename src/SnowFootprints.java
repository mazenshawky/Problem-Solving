// https://codeforces.com/contest/298/problem/A

import java.util.Scanner;

public class SnowFootprints {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int roadLength = scanner.nextInt();
        String road = scanner.next();

        int traceStart = -1, traceEnd = -1;

        // Find the start and end of the footprints
        for (int i = 0; i < roadLength; i++) {
            if (road.charAt(i) != '.' && traceStart == -1) {
                traceStart = i;
            }
            if (road.charAt(i) != '.') {
                traceEnd = i;
            }
        }

        // Check the direction of the footprints
        if (road.charAt(traceStart) == 'R' && road.charAt(traceEnd) == 'R') {
            // Case: Moving to the right only
            System.out.println((traceStart + 1) + " " + (traceEnd + 2));
        } else if (road.charAt(traceStart) == 'L' && road.charAt(traceEnd) == 'L') {
            // Case: Moving to the left only
            System.out.println((traceEnd + 1) + " " + traceStart);
        } else {
            // Case: Both directions (R first, then L)
            int firstR = traceStart;
            int firstL = traceEnd;

            // Adjust the end position correctly
            while (road.charAt(firstL) == 'L') {
                firstL--;
            }

            System.out.println((firstR + 1) + " " + (firstL + 1));
        }
    }
}