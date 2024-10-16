// https://codeforces.com/problemset/problem/682/A

import java.util.Scanner;

public class AlyonaAndNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // size of set A
        int m = scanner.nextInt();  // size of set B
        
        // Calculate how many numbers in A have each remainder modulo 5
        long[] remainderA = new long[5];
        for (int i = 1; i <= n; i++) {
            remainderA[i % 5]++;
        }
        
        // Calculate how many numbers in B have each remainder modulo 5
        long[] remainderB = new long[5];
        for (int i = 1; i <= m; i++) {
            remainderB[i % 5]++;
        }
        
        // Calculate the total valid pairs
        long result = 0;
        result += remainderA[0] * remainderB[0]; // (0, 0)
        result += remainderA[1] * remainderB[4]; // (1, 4)
        result += remainderA[2] * remainderB[3]; // (2, 3)
        result += remainderA[3] * remainderB[2]; // (3, 2)
        result += remainderA[4] * remainderB[1]; // (4, 1)
        
        System.out.println(result);
    }
}