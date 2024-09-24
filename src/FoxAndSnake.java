// https://codeforces.com/problemset/problem/510/A

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int rowsCount = scanner.nextInt();
        int columnsCount = scanner.nextInt();

        boolean isSnakeHeadAtEnd = true;
        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (i % 2 != 0 && j == columnsCount - 1 && isSnakeHeadAtEnd) {
                    System.out.print('#');
                    isSnakeHeadAtEnd = false;
                } else if (i % 2 != 0 && j == 0 && !isSnakeHeadAtEnd) {
                    System.out.print('#');
                } else if (i % 2 == 0) {
                    System.out.print('#');
                } else {
                    System.out.print('.');
                    if (j == columnsCount - 1) {
                        isSnakeHeadAtEnd = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
