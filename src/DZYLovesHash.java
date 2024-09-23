// https://codeforces.com/problemset/problem/447/A

import java.util.Scanner;
import java.util.ArrayList;

public class DZYLovesHash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bucketsCount = scanner.nextInt();
        int numbersCount = scanner.nextInt();

        int[] numbers = new int[numbersCount];

        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbersCount; i++) {
            int value = numbers[i] % bucketsCount;

            if (values.contains(value)) {
                System.out.println(i + 1);
                return;
            }
            values.add(value);
        }
        System.out.println(-1);
    }
}