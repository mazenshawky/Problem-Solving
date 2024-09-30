// https://codeforces.com/problemset/problem/699/A

import java.util.Scanner;

public class LaunchOfCollider {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int particlesCount = scanner.nextInt();

        String particlesWays = scanner.next();

        int[] particlesCoordinates = new int[particlesCount];

        for (int i = 0; i < particlesCount; i++) {
            particlesCoordinates[i] = scanner.nextInt();
        }

        int explosionMomentInMicroSeconds = Integer.MAX_VALUE;

        for (int i = 0; i < particlesCount - 1; i++) {
            if (particlesWays.charAt(i) == 'R') {
                if (particlesWays.charAt(i + 1) == 'L') {
                    int currentExplosion = (particlesCoordinates[i + 1] - particlesCoordinates[i]) / 2;
                    explosionMomentInMicroSeconds = Math.min(explosionMomentInMicroSeconds, currentExplosion);
                }
            }
        }
        if (explosionMomentInMicroSeconds == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(explosionMomentInMicroSeconds);
        }
    }
}
