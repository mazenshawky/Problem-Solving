// https://codeforces.com/problemset/problem/262/B

import java.util.Arrays;
import java.util.Scanner;

public class RomaAndChangingSigns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIncomes = scanner.nextInt();
        int numberOfSwaps = scanner.nextInt();

        int[] incomes = new int[numberOfIncomes];

        for (int i = 0; i < numberOfIncomes; i++) {
            incomes[i] = scanner.nextInt();
        }

        // Flip the negative incomes to maximize the total
        for (int i = 0; i < numberOfIncomes && numberOfSwaps > 0; i++) {
            if (incomes[i] < 0) {
                incomes[i] = -incomes[i];
                numberOfSwaps--;
            }
        }

        int totalIncome = Arrays.stream(incomes).sum();

        // If swaps are left and is odd, minimize the smallest absolute value
        if (numberOfSwaps % 2 != 0) {
            int minIncome = Arrays.stream(incomes).min().getAsInt();
            totalIncome -= 2 * minIncome;
        }

        System.out.println(totalIncome);
    }
}
