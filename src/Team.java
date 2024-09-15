// https://codeforces.com/contest/231/problem/A

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int problemsCount = scanner.nextInt();
		
		int implementedProblemsCount = 0;
		
		for(int i = 0; i < problemsCount; i++) {
			int sureViewsCount = 0;
			for(int j = 0; j < 3; j++) {
				int memberView = scanner.nextInt();
				if(memberView == 1) {
					sureViewsCount++;
				}
			}
			if(sureViewsCount >= 2) {
				implementedProblemsCount++;
			}
		}
		
		System.out.println(implementedProblemsCount);
	}
}
