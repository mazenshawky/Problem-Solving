// https://codeforces.com/problemset/problem/236/B

import java.util.HashMap;
import java.util.Scanner;

public class EasyNumberChallenge {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        HashMap<Integer, Integer> divisorCache = new HashMap<>();

        int moduloSum = 0;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    int product = i * j * k;

                    if (!divisorCache.containsKey(product)) {
                        divisorCache.put(product, countDivisors(product));
                    }

                    moduloSum += divisorCache.get(product);
                }
            }
        }

        System.out.println(moduloSum);
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal, count only once
                if (i == n / i) {
                    count++; // For perfect square
                } else {
                    count += 2; // Count both i and n / i
                }
            }
        }
        return count;
    }
}
