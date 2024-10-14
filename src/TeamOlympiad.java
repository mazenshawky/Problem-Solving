// https://codeforces.com/problemset/problem/490/A

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TeamOlympiad {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int childrenCount = scanner.nextInt();

        Queue<Integer> programmingSkills = new LinkedList<>();
        Queue<Integer> mathSkills = new LinkedList<>();
        Queue<Integer> sportSkills = new LinkedList<>();

        for (int i = 0; i < childrenCount; i++) {
            int childSkill = scanner.nextInt();
            switch (childSkill) {
                case 1 ->
                    programmingSkills.add(i + 1);
                case 2 ->
                    mathSkills.add(i + 1);
                case 3 ->
                    sportSkills.add(i + 1);
            }
        }

        int minSkillsCount = Math.min(programmingSkills.size(), Math.min(mathSkills.size(), sportSkills.size()));

        System.out.println(minSkillsCount);

        for (int i = 0; i < minSkillsCount; i++) {
            System.out.println(programmingSkills.poll() + " " + mathSkills.poll() + " " + sportSkills.poll() + " ");
        }
    }
}
