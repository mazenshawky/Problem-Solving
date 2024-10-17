// https://codeforces.com/contest/268/problem/A

import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int teamsCount = scanner.nextInt();

        int[][] teamsUniforms = new int[teamsCount][2];

        for (int i = 0; i < teamsCount; i++) {
            teamsUniforms[i][0] = scanner.nextInt();
            teamsUniforms[i][1] = scanner.nextInt();
        }

        int gamesWithHostPlayInGuestUniformCount = 0;
        for (int i = 0; i < teamsCount; i++) {
            for (int j = 0; j < teamsCount; j++) {
                if (teamsUniforms[i][0] == teamsUniforms[j][1]) {
                    gamesWithHostPlayInGuestUniformCount++;
                }
            }
        }

        System.out.println(gamesWithHostPlayInGuestUniformCount);
    }
}
