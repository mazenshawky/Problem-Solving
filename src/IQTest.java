// https://codeforces.com/contest/287/problem/A

import java.util.Scanner;

public class IQTest {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[4][4];

        for (int i = 0; i < matrix.length; i++) {
            String row = scanner.next();
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = String.valueOf(row.charAt(j)); 
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int dotsCount = 0;
                int hashtagsCount = 0;

                if (".".equals(matrix[i][j])) dotsCount++; else hashtagsCount++;
                if (".".equals(matrix[i][j + 1])) dotsCount++; else hashtagsCount++;
                if (".".equals(matrix[i + 1][j])) dotsCount++; else hashtagsCount++;
                if (".".equals(matrix[i + 1][j + 1])) dotsCount++; else hashtagsCount++;

                if (dotsCount >= 3 || hashtagsCount >= 3) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
