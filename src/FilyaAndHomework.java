// https://codeforces.com/problemset/problem/714/B

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FilyaAndHomework {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numberOfElements = scanner.nextInt();
        Set<Integer> uniqueNumbers = new TreeSet<>();

        for (int i = 0; i < numberOfElements; i++) {
            int currentNumber = scanner.nextInt();
            uniqueNumbers.add(currentNumber);
        }

        if (uniqueNumbers.size() < 3) {
            System.out.println("YES");
        } else if (uniqueNumbers.size() > 3) {
            System.out.println("NO");
        } else {
            Integer[] sortedNumbers = uniqueNumbers.toArray(Integer[]::new);
            if (sortedNumbers[1] - sortedNumbers[0] == sortedNumbers[2] - sortedNumbers[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
