// https://codeforces.com/problemset/problem/143/A

// You have six equations:
// 𝑎 + 𝑏 = firstRowSum
// c + d = secondRowSum
// a + c = firstColumnSum
// b + d = secondColumnSum
// a + d = firstDiagonalSum
// b + c = secondDiagonalSum

// From the first two equations, you can express b and d in terms of a and c:
// b = firstRowSum − a
// d = secondRowSum − c

import java.util.Scanner;

public class HelpVasilisaTheWise2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int firstRowSum = scanner.nextInt();
        int secondRowSum = scanner.nextInt();

        int firstColumnSum = scanner.nextInt();
        int secondColumnSum = scanner.nextInt();

        int firstDiagonalSum = scanner.nextInt();
        int secondDiagonalSum = scanner.nextInt();

        // Try different values for a and c within bounds [1, 9] as the matrix has single digits
        for (int a = 1; a <= 9; a++) {
            for (int c = 1; c <= 9; c++) {
                int b = firstRowSum - a;
                int d = secondRowSum - c;

                // Check if b and d are within the range [1, 9] and satisfy the conditions
                if (b >= 1 && b <= 9 && d >= 1 && d <= 9
                        && a + c == firstColumnSum
                        && b + d == secondColumnSum
                        && a + d == firstDiagonalSum
                        && b + c == secondDiagonalSum) {

                    // Ensure all values are unique (since Vasilisa has only one gem per number)
                    if (a != b && a != c && a != d && b != c && b != d && c != d) {
                        System.out.println(a + " " + b);
                        System.out.println(c + " " + d);
                        return;
                    }
                }
            }
        }

        System.out.println(-1);
    }
}
