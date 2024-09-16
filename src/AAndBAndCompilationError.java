// https://codeforces.com/problemset/problem/519/B

import java.util.Scanner;

public class AAndBAndCompilationError {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int firstSum = 0, secondSum = 0, thirdSum = 0;
        
        int errorsCount = scanner.nextInt();

        for (int i = 0; i < errorsCount; i++)
            firstSum += scanner.nextInt();

        for (int i = 0; i < errorsCount - 1; i++)
            secondSum += scanner.nextInt();

        for (int i = 0; i < errorsCount - 2; i++)
            thirdSum += scanner.nextInt();

        System.out.println(firstSum - secondSum);
        System.out.println(secondSum - thirdSum);
    }
}
