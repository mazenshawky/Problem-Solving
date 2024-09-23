// https://codeforces.com/problemset/problem/732/A

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int shovelPrice = scanner.nextInt();
        int coin = scanner.nextInt();

        for (int i = 1;; i++) {
            if (shovelPrice * i % 10 == 0 || (shovelPrice * i - coin) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
