// https://codeforces.com/problemset/problem/253/B

import java.io.*;
import java.util.*;

public class PhysicsPractical {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));

        int measurementsCount = Integer.parseInt(reader.readLine().trim());
        int[] measurements = Arrays.stream(reader.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(measurements);

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < measurementsCount; i++) {
            int target = measurements[i] * 2;
            int x = upperBound(measurements, target);

            // `i + (measurementsCount - x)` calculates the number of elements to remove to satisfy the condition 
            // `smallest * 2 >= largest` by removing `i` elements from the start and `measurementsCount - x` 
            // elements from the end, where `x` is the index of the first element greater than `a[i] * 2`.
            result = Math.min(result, i + (measurementsCount - x));
        }

        writer.println(result);
        reader.close();
        writer.close();
    }

    private static int upperBound(int[] a, int target) {
        int low = 0, high = a.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (a[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
