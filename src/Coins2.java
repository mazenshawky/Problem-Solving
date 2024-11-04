// https://codeforces.com/contest/47/problem/B

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coins2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a map to store counts for A, B, and C
        Map<Character, Integer> countMap = new HashMap<>();
        countMap.put('A', 0);
        countMap.put('B', 0);
        countMap.put('C', 0);

        // Process three input strings
        for (int i = 0; i < 3; i++) {
            String s = scanner.nextLine();
            if (s.charAt(1) == '>') {
                countMap.put(s.charAt(0), countMap.get(s.charAt(0)) + 1);
            } else {
                countMap.put(s.charAt(2), countMap.get(s.charAt(2)) + 1);
            }
        }

        // Check if each coin has been compared once (Impossible case)
        if (countMap.get('A') == 1 && countMap.get('B') == 1 && countMap.get('C') == 1) {
            System.out.println("Impossible");
        } else {
            // Determine the order based on the counts in countMap
            StringBuilder output = new StringBuilder();
            output.append(getCharByCount(countMap, 0));
            output.append(getCharByCount(countMap, 1));
            output.append(getCharByCount(countMap, 2));
            System.out.println(output.toString());
        }
    }

    // Helper method to find character by count
    private static char getCharByCount(Map<Character, Integer> map, int count) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == count) {
                return entry.getKey();
            }
        }
        return ' '; // Default return, though it won't be reached in a valid case
    }
}
