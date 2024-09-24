// https://codeforces.com/problemset/problem/510/A

import java.util.Scanner;

public class FoxAndSnake2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int rowsCount = scanner.nextInt();
        int columnsCount = scanner.nextInt();

        for (int i = 0; i < rowsCount; i++) {
            if (i % 2 == 0) {
                // Full row of '#'
                System.out.println("#".repeat(columnsCount));
            } else if (i % 4 == 1) {
                // Row where snake head is at the end
                System.out.println(".".repeat(columnsCount - 1) + "#");
            } else {
                // Row where snake head is at the start
                System.out.println("#" + ".".repeat(columnsCount - 1));
            }
        }
    }
}
