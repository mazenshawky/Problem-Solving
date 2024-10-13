// https://codeforces.com/contest/365/problem/A

import java.util.Scanner;
 
public class GoodNumber {
 
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
 
        int numbersCounts = scanner.nextInt();
        int notExceededNum = scanner.nextInt();
 
        int goodNumbersCount = 0;
        for (int i = 0; i < numbersCounts; i++) {
            String number = scanner.next();
 
            boolean[] digitsPresent = new boolean[notExceededNum + 1];
            int digitsFound = 0;
 
            for (char c : number.toCharArray()) {
                int digit = Character.getNumericValue(c);
                if (digit <= notExceededNum && !digitsPresent[digit]) {
                    digitsPresent[digit] = true;
                    digitsFound++;
                }
            }
            if (digitsFound == notExceededNum + 1) {
                goodNumbersCount++;
            }
        }
        
        System.out.println(goodNumbersCount);
    }
}