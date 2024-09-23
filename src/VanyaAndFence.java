// https://codeforces.com/problemset/problem/677/A

import java.util.Scanner;

public class VanyaAndFence {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int friendsCount = scanner.nextInt();
        int fenceHeight = scanner.nextInt();

        int minRoadWidth = 0;
        for (int i = 0; i < friendsCount; i++) {
            int friendHeight = scanner.nextInt();

            if (friendHeight > fenceHeight) {
                minRoadWidth += 2;
            } else {
                minRoadWidth++;
            }
        }
        System.out.println(minRoadWidth);
    }
}
