// https://codeforces.com/problemset/problem/352/B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class JeffAndPeriods {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numbersCount = Integer.parseInt(br.readLine());
        String str[] = br.readLine().trim().split("\\s+");
        int a[] = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        ArrayList<ArrayList<Integer>> indices = new ArrayList<>();
        for (int i = 0; i < 100001; i++) {
            indices.add(new ArrayList<>());
        }

        for (int i = 0; i < numbersCount; i++) {
            indices.get(a[i]).add(i);
        }

        ArrayList<ArrayList<Integer>> validPatterns = new ArrayList<>();
        for (int number = 0; number < indices.size(); number++) {
            if (indices.get(number).isEmpty()) {
                continue;
            }

            ArrayList<Integer> differences = new ArrayList<>();
            for (int j = 1; j < indices.get(number).size(); j++) {
                differences.add(indices.get(number).get(j) - indices.get(number).get(j - 1));
            }

            if (indices.get(number).size() == 1) {
                differences.add(0); // Single occurrence
            }

            HashSet<Integer> uniqueDifferences = new HashSet<>(differences);
            if (uniqueDifferences.size() == 1) {
                ArrayList<Integer> pattern = new ArrayList<>();
                pattern.add(number);
                pattern.add(differences.get(0)); // The common difference
                validPatterns.add(pattern);
            }
        }

        System.out.println(validPatterns.size());
        for (int i = 0; i < validPatterns.size(); i++) {
            System.out.println(validPatterns.get(i).get(0) + " " + validPatterns.get(i).get(1));
        }
    }
}
