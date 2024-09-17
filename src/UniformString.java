// https://codeforces.com/problemset/problem/1092/A

import java.util.Scanner;

public class UniformString {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        StringBuilder result = new StringBuilder();

        int queriesCount = scanner.nextInt();

        for (int i = 0; i < queriesCount; i++) {
            int resultLength = scanner.nextInt();
            int numOfUsedChars = scanner.nextInt();

            for (int j = 0; j < numOfUsedChars; j++) {
                result.append(chars[j]);
            }

            String repeatedBuffer = result.toString();
            while (result.length() < resultLength) {
                int availableLength = resultLength - result.length();
                
                if (availableLength >= repeatedBuffer.length()) {
                    result.append(repeatedBuffer);
                } else {
                    result.append(chars[0]);
                }
            }
            System.out.println(result.toString());
            result.delete(0, result.length());
        }
    }
}
