// https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int weight = scanner.nextInt();

        if (weight % 2 == 0 && weight != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
