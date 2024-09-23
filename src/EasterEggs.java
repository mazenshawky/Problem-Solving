// https://codeforces.com/problemset/problem/78/B

import java.util.Scanner;

public class EasterEggs {

    public static void main(String[] args) {    
        var scanner = new Scanner(System.in);
        int eggsCount = scanner.nextInt();

        final String baseColors = "ROYGBIV";
        final String repeatingPattern = "GBIV";

        StringBuilder eggsColors = new StringBuilder(baseColors);

        while (eggsColors.length() < eggsCount) {
            eggsColors.append(repeatingPattern);
        }

        System.out.println(eggsColors.substring(0, eggsCount));
    }
}
