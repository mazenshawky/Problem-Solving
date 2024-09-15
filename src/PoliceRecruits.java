// https://codeforces.com/contest/427/problem/A

import java.util.Scanner;

public class PoliceRecruits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int availableOfficers = 0, untreatedCrimesCount = 0;
        int eventsCount = scanner.nextInt();
        int[] events = new int[eventsCount];

        for (int i = 0; i < eventsCount; i++) {
            events[i] = scanner.nextInt();
            if (events[i] == -1) {
                if (availableOfficers != 0) {
                    availableOfficers--;
                } else {
                    untreatedCrimesCount++;
                }
            } else {
                availableOfficers += events[i];
            }
        }
        System.out.println(untreatedCrimesCount);
    }
}
