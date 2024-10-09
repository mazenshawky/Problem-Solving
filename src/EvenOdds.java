// https://codeforces.com/contest/318/problem/A

import java.util.Scanner;

public class EvenOdds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long toNum = scanner.nextLong();
        long position = scanner.nextLong();

        long middle = (toNum + 1) / 2;  // Number of odd numbers

        if (position <= middle) {
            // If position falls in the odd numbers
            System.out.println(2 * position - 1);
        } else {
            // If position falls in the even numbers
            System.out.println(2 * (position - middle));
        }
    }
}