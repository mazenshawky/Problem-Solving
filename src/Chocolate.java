// https://codeforces.com/contest/617/problem/B

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chocolate {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int piecesCount = scanner.nextInt();

        int[] pieces = new int[piecesCount];

        for (int i = 0; i < piecesCount; i++) {
            pieces[i] = scanner.nextInt();
        }

        List<Integer> piecesWithNut = new ArrayList<>();

        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == 1) {
                piecesWithNut.add(i);
            }
        }

        if (piecesWithNut.isEmpty()) {
            System.out.println(0);
            return;
        }

        long result = 1;
        for (int i = 1; i < piecesWithNut.size(); i++) {
            int gap = piecesWithNut.get(i) - piecesWithNut.get(i - 1);
            result *= gap;
        }

        System.out.println(result);
    }
}
