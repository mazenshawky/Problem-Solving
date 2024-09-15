// https://codeforces.com/contest/289/problem/A

import java.util.Scanner;

public class PoloThePenguinAndSegments {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int minNumOfMovesNeeded = 0, totalValuesOfSegments = 0;

        int segmentsCount = scanner.nextInt();
        int divisibleNum = scanner.nextInt();

        for (int i = 0; i < segmentsCount; i++) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            totalValuesOfSegments += calculateValueOfSegment(firstNum, secondNum);
        }

        int remainder = totalValuesOfSegments % divisibleNum;

        if(remainder != 0) {
            minNumOfMovesNeeded = divisibleNum - remainder;
        }
        System.out.println(minNumOfMovesNeeded);
    }

    public static int calculateValueOfSegment(int firstNum, int secondNum) {
        return secondNum - firstNum + 1;
    }
}
