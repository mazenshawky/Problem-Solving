// https://codeforces.com/problemset/problem/265/A

import java.util.Scanner;

public class ColorfulStones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stones = scanner.next();
        String instructions = scanner.next();

        int lisaStone = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == stones.charAt(lisaStone)) {
                lisaStone++;
            }
        }
        System.out.println(++lisaStone);
    }
}
