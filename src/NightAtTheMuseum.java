// https://codeforces.com/problemset/problem/731/A

import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pointerIndex = 0, totalMoves = 0;

        String name = scanner.next();
        for (int i = 0; i < name.length(); i++) {
            char myChar = name.charAt(i);
            int destinationIndex = myChar - 97; // to make a = 0, ..., z = 25 [ASCII Code]

            int moves = Math.abs(pointerIndex - destinationIndex);
            if (moves < 13) {
                totalMoves += moves;
            } else {
                totalMoves += 26 - moves;
            }
            pointerIndex = destinationIndex;
        }
        System.out.println(totalMoves);
    }
}
