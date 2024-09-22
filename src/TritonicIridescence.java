// https://codeforces.com/contest/957/problem/A

import java.util.Scanner;

public class TritonicIridescence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int canvasLength = scanner.nextInt();
        String canvas = scanner.next();

        char[] canvasArray = canvas.toCharArray();

        for (int i = 0; i < canvasLength; i++) {
            // repeated C,Y or M
            if (i < canvasLength - 1 && canvasArray[i] != '?' && canvasArray[i] == canvasArray[i + 1]) {
                System.out.println("No");
                return;
            }
        }

        boolean canBePaintedWithTwoWays = false;
        for (int i = 0; i < canvasLength; i++) {
            // question mark is the first or the last character
            if ((i == 0 || i == canvasLength - 1) && canvasArray[i] == '?') {
                canBePaintedWithTwoWays = true;
                break;
            }

            if (i != 0 && i != canvasLength - 1 && canvasArray[i] == '?') {
                // question mark is between two C, Y or M
                if (canvasArray[i - 1] == canvasArray[i + 1]
                        && canvasArray[i - 1] != '?') {
                    canBePaintedWithTwoWays = true;
                    break;
                }
                // question mark has another question mark before or after it
                if (canvasArray[i - 1] == '?' || canvasArray[i + 1] == '?') {
                    canBePaintedWithTwoWays = true;
                    break;
                }
            }
        }

        if (canBePaintedWithTwoWays) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
