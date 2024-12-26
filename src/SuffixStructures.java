// https://codeforces.com/contest/448/problem/B

import java.util.Arrays;
import java.util.Scanner;

public class SuffixStructures {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String firstWord = scanner.next();
        String secondWord = scanner.next();

        if (isAutomaton(firstWord, secondWord)) {
            System.out.println("automaton");
        } else if (isArray(firstWord, secondWord)) {
            System.out.println("array");
        } else if (isBoth(firstWord, secondWord)) {
            System.out.println("both");
        } else {
            System.out.println("need tree");
        }
    }

    private static boolean isAutomaton(String firstWord, String secondWord) {
        int j = 0;
        for (int i = 0; i < firstWord.length() && j < secondWord.length(); i++) {
            if (firstWord.charAt(i) == secondWord.charAt(j)) {
                j++;
            }
        }
        return j == secondWord.length();
    }

    private static boolean isArray(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }

        char[] firstArray = firstWord.toCharArray();
        char[] secondArray = secondWord.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

    private static boolean isBoth(String firstWord, String secondWord) {
        int[] firstFreq = new int[26];
        int[] secondFreq = new int[26];

        for (char c : firstWord.toCharArray()) {
            firstFreq[c - 'a']++;
        }
        for (char c : secondWord.toCharArray()) {
            secondFreq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (secondFreq[i] > firstFreq[i]) {
                return false;
            }
        }
        return firstWord.length() > secondWord.length();
    }
}
