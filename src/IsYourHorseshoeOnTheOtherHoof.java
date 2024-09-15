// https://codeforces.com/contest/228/problem/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoeOnTheOtherHoof {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> uniqueShoesColors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            int shoeColor = scanner.nextInt();
            uniqueShoesColors.add(shoeColor);
        }

        int minNumOfShoesToBuy = 4 - uniqueShoesColors.size();
        System.out.println(minNumOfShoesToBuy);
    }
}
