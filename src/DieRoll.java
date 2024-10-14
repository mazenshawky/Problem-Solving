// https://codeforces.com/problemset/problem/9/A

import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int yakkoResult = scanner.nextInt();
        int wakkoResult = scanner.nextInt();

        int maxResult = Math.max(yakkoResult, wakkoResult);

        String[] outcomes = {"1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};

        System.out.println(outcomes[6 - maxResult]);
    }
}
