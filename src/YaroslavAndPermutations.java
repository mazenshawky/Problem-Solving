// https://codeforces.com/contest/296/problem/A

import java.util.HashMap;
import java.util.Scanner;

public class YaroslavAndPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> frequencies = new HashMap<>();

        int elementsCount = scanner.nextInt();

        int[] elements = new int[elementsCount];

        for (int i = 0; i < elementsCount; i++) {
            elements[i] = scanner.nextInt();
        }

        for (int element : elements) {
            frequencies.put(element, frequencies.getOrDefault(element, 0) + 1);
        }

        int maxFrequency = frequencies.values().stream().max(Integer::compare).get();

        if (maxFrequency <= (elementsCount + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
