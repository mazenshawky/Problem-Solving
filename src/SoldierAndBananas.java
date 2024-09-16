// https://codeforces.com/contest/546/problem/A

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int totalPrice = 0, neededMoneyToBorrow = 0;

        int bananaCost = scanner.nextInt();

        int soldierMoney = scanner.nextInt();

        int bananasNeededCount = scanner.nextInt();

        for (int i = 1; i <= bananasNeededCount; i++)
            totalPrice += i * bananaCost;

        if (soldierMoney < totalPrice) {
            neededMoneyToBorrow = totalPrice - soldierMoney;
        }
        System.out.println(neededMoneyToBorrow);
    }
}
