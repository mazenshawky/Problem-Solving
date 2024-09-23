// https://codeforces.com/problemset/problem/102/B

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int spellCount = 0;

        String number = scanner.nextLine();

        if (number.length() > 1) {
            spellCount++;
        }

        int sum = sumOfDigits(number);

        while (sum >= 10) {
            sum = sumOfDigits(Integer.toString(sum));
            spellCount++;
        }
        System.out.println(spellCount);
    }

    public static int sumOfDigits(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += digit - '0'; // Convert char to int [ASCII Code]
        }
        return sum;
    }
}
