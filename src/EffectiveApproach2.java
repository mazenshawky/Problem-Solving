// https://codeforces.com/contest/227/problem/B

import java.util.Scanner;

public class EffectiveApproach2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();

        int[] elementIndices = new int[100005];

        for (int i = 1; i <= numberOfElements; i++) {
            int element
                    = scanner.nextInt();
            elementIndices[element] = i; // 1-indexed
        }

        int numberOfQueries = scanner.nextInt();
        long vasyaTotalComparisons = 0, petyaTotalComparisons = 0;

        for (int i = 0; i < numberOfQueries; i++) {
            int q = scanner.nextInt();
            int position = elementIndices[q]; // 1-indexed position
            vasyaTotalComparisons += position;
            petyaTotalComparisons += numberOfElements - position + 1; // Reverse count
        }

        System.out.println(vasyaTotalComparisons + " " + petyaTotalComparisons);
    }
}
