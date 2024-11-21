// https://codeforces.com/contest/227/problem/B

import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();
        HashMap<Integer, Integer> elementIndices = new HashMap<>();

        for (int i = 1; i <= numberOfElements; i++) {
            int element = scanner.nextInt();
            elementIndices.put(element, i); // 1-indexed
        }

        int numberOfQueries = scanner.nextInt();
        long vasyaTotalComparisons = 0;
        long petyaTotalComparisons = 0;

        for (int i = 0; i < numberOfQueries; i++) {
            int query = scanner.nextInt();
            int position = elementIndices.get(query); // 1-indexed position
            vasyaTotalComparisons += position;
            petyaTotalComparisons += numberOfElements - position + 1; // Reverse count
        }

        System.out.println(vasyaTotalComparisons + " " + petyaTotalComparisons);
    }
}
