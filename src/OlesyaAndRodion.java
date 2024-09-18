// https://codeforces.com/problemset/problem/584/A

import java.util.Scanner;

public class OlesyaAndRodion {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int digitsCount = scanner.nextInt();
        int divisibleByNum = scanner.nextInt();

        String result = getResult(digitsCount, divisibleByNum);

        System.out.println(result);
    }

    public static String getResult(int digitsCount, int divisibleByNum) {

        if (digitsCount == 1)
            return divisibleByNum == 10 ? "-1" : String.valueOf(divisibleByNum);

        if (divisibleByNum == 10)
            return "1" + "0".repeat(digitsCount - 1);

        return String.valueOf(divisibleByNum).repeat(digitsCount);
    }
}
