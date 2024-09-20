// https://codeforces.com/problemset/problem/16/A

import java.util.Scanner;

public class Flag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsCount = scanner.nextInt();
        int columnsCount = scanner.nextInt();

        int[][] flag = new int[rowsCount][columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            String row = scanner.next();
            for (int j = 0; j < row.length(); j++) {
                flag[i][j] = Integer.parseInt(String.valueOf(row.charAt(j)));
            }
        }

        boolean isFlagValid = true;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (flag[i][0] != flag[i][j]) {
                    isFlagValid = false;
                    break;
                }
            }
            if (i < rowsCount - 1) {
                if (flag[i][0] == flag[i + 1][0]) {
                    isFlagValid = false;
                    break;
                }
            }
        }

        if (isFlagValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
