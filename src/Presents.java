// https://codeforces.com/contest/136/problem/A

import java.util.Scanner;

public class Presents {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int friendsCount = scanner.nextInt();

        int[] givers = new int[friendsCount + 1];

        for (int i = 1; i <= friendsCount; i++) {
            int taker = scanner.nextInt();
            givers[taker] = i;
        }

        for (int i = 1; i < givers.length; i++) {
            System.out.print(givers[i] + " ");
        }
    }
}
