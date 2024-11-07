// https://codeforces.com/contest/400/problem/B

import java.util.HashSet;
import java.util.Scanner;

public class InnaAndNewMatrixOfCandies {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int rowsCount = scanner.nextInt();
        int columnsCount = scanner.nextInt();

        HashSet<Integer> distinctMoves = new HashSet<>();

        for (int i = 0; i < rowsCount; i++) {
            String row = scanner.next();

            int gIndex = 0, sIndex = 0;
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == 'G') {
                    gIndex = j;
                } else if (row.charAt(j) == 'S') {
                    sIndex = j;
                }
            }
            if (sIndex - gIndex < 0) {
                System.out.println(-1);
                return;
            }
            distinctMoves.add(sIndex - gIndex);
        }

        System.out.println(distinctMoves.size());
    }
}
