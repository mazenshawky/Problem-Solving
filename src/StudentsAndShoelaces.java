// https://codeforces.com/contest/129/problem/B

import java.util.*;

public class StudentsAndShoelaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();
        int numberOfLaces = scanner.nextInt();

        List<Integer>[] adjList = new ArrayList[numberOfStudents + 1];
        int[] degree = new int[numberOfStudents + 1];

        for (int i = 1; i <= numberOfStudents; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < numberOfLaces; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adjList[a].add(b);
            adjList[b].add(a);
            degree[a]++;
            degree[b]++;
        }

        int kickedGroupsCount = 0;
        boolean removedAtLeastOne;

        do {
            removedAtLeastOne = false;
            List<Integer> toRemove = new ArrayList<>();

            for (int i = 1; i <= numberOfStudents; i++) {
                if (degree[i] == 1) {
                    toRemove.add(i);
                }
            }

            for (int student : toRemove) {
                for (int neighbor : adjList[student]) {
                    degree[neighbor]--;
                }
                degree[student] = 0; // Mark as removed
                removedAtLeastOne = true;
            }

            if (removedAtLeastOne) {
                kickedGroupsCount++;
            }

        } while (removedAtLeastOne);

        System.out.println(kickedGroupsCount);
    }
}
