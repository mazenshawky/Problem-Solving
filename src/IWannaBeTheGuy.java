// https://codeforces.com/problemset/problem/469/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeTheGuy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> cooparationPassedLevels = new HashSet<>();

        int levelsCount = scanner.nextInt();

        int levelsXCanPassCount = scanner.nextInt();

        for (int i = 0; i < levelsXCanPassCount; i++) {
            cooparationPassedLevels.add(scanner.nextInt());
        }

        int levelsYCanPassCount = scanner.nextInt();

        for (int i = 0; i < levelsYCanPassCount; i++) {
            cooparationPassedLevels.add(scanner.nextInt());
        }

        if (cooparationPassedLevels.size() == levelsCount) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
