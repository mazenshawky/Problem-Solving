// https://codeforces.com/problemset/problem/148/A

import java.util.Scanner;
import java.util.HashSet;

public class InsomniaCure {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int dragonsCount = scanner.nextInt();

        if (k == 1) {
            System.out.println(dragonsCount);
            return;
        }

        HashSet<Integer> harmedDragons = new HashSet<>();

        for (int i = k; i <= dragonsCount; i += k) {
            harmedDragons.add(i);
        }
        for (int i = l; i <= dragonsCount; i += l) {
            harmedDragons.add(i);
        }
        for (int i = m; i <= dragonsCount; i += m) {
            harmedDragons.add(i);
        }
        for (int i = n; i <= dragonsCount; i += n) {
            harmedDragons.add(i);
        }

        System.out.println(harmedDragons.size());
    }
}
