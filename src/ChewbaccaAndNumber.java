// https://codeforces.com/contest/514/problem/A

import java.util.Scanner;

public class ChewbaccaAndNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        StringBuilder transformedNumber = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            char currentChar = number.charAt(i);
            int digit = Character.getNumericValue(currentChar);

            if ((i == 0 && digit == 9) || digit < 5) {
                transformedNumber.append(currentChar);
            } else {
                digit = 9 - digit;
                transformedNumber.append(digit);
            }
        }

        System.out.println(transformedNumber);
    }
}
