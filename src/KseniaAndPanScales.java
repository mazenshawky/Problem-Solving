// https://codeforces.com/contest/382/problem/A

import java.util.Scanner;

public class KseniaAndPanScales {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String scales = scanner.nextLine();
        String unusedScales = scanner.nextLine();

        String[] parts = scales.split("\\|"); 
        String leftPart = parts.length > 0 ? parts[0] : "";
        String rightPart = parts.length > 1 ? parts[1] : "";

        for (char c : unusedScales.toCharArray()) {
            if (leftPart.length() <= rightPart.length()) {
                leftPart += c;
            } else {
                rightPart += c;
            }
        }

        if (leftPart.length() == rightPart.length()) {
            System.out.println(leftPart + "|" + rightPart);
        } else {
            System.out.println("Impossible");
        }
    }
}