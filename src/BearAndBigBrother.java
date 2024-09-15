// https://codeforces.com/contest/791/problem/A

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int limakWeight = scanner.nextInt();
		int bobWeight = scanner.nextInt();
		
		int yearsForLimakToBecomeLargerThanBob = 0;
		
		while(limakWeight <= bobWeight) {
			limakWeight *= 3;
			bobWeight *= 2;
			yearsForLimakToBecomeLargerThanBob++;
		}
		
		System.out.println(yearsForLimakToBecomeLargerThanBob);
	}
}