// https://codeforces.com/problemset/problem/415/B

import java.util.Scanner;

public class MashmokhAndTokens {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int daysCount = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();

        for (int i = 0; i < daysCount; i++) {
            long dayTokens = scanner.nextInt();

            // Calculate the "wasted distance" (remaining tokens after maximizing conversions):
            // (dayTokens * a) % b gives us the leftover tokens that can't be fully converted into money.
            long mod = (dayTokens * a) % b;

            // We now want to find the "saved tokens" that created this wasted distance:
            // To understand why we divide by 'a', consider this example:
            // Let dayTokens = 12, a = 2, b = 5.
            // We calculate (12 * 2) % 5 = 4, meaning the wasted distance is 4.
            // This 4 comes from tokens we "over-counted"; by dividing mod / a, we find how many tokens
            // caused this excess. In this example, 4 / 2 = 2 tokens created the leftover.
            long k0 = mod / a;

            System.out.print(k0 + " ");
        }
    }
}
