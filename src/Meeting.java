// https://codeforces.com/problemset/problem/144/B

import java.util.Scanner;

public class Meeting {

    static int[] xpos, ypos, r;
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        n = scanner.nextInt();

        // Initialize arrays for circle data
        xpos = new int[n];
        ypos = new int[n];
        r = new int[n];

        for (int i = 0; i < n; i++) {
            xpos[i] = scanner.nextInt();
            ypos[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int numOfBlankets = 0;

        // Check horizontal boundaries (top and bottom)
        for (int i = Math.min(x1, x2); i <= Math.max(x1, x2); i++) {
            numOfBlankets += isOutsideAllCircles(i, y1) ? 1 : 0;
            numOfBlankets += isOutsideAllCircles(i, y2) ? 1 : 0;
        }

        // Check vertical boundaries (left and right, excluding corners already checked)
        for (int i = Math.min(y1, y2) + 1; i < Math.max(y1, y2); i++) {
            numOfBlankets += isOutsideAllCircles(x1, i) ? 1 : 0;
            numOfBlankets += isOutsideAllCircles(x2, i) ? 1 : 0;
        }

        System.out.println(numOfBlankets);
    }

    private static int squaredDistance(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return dx * dx + dy * dy;
    }

    private static boolean isOutsideAllCircles(int x, int y) {
        for (int i = 0; i < n; i++) {
            if (squaredDistance(x, y, xpos[i], ypos[i]) <= r[i] * r[i]) {
                return false; // Point is inside or on the boundary of circle i
            }
        }
        return true; // Point is outside all circles
    }
}
