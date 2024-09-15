// https://codeforces.com/contest/263/problem/A

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        int numberOfMovesNeeded = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    numberOfMovesNeeded = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }

        System.out.println(numberOfMovesNeeded);
    }
}
