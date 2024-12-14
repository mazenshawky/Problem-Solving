// https://codeforces.com/contest/385/problem/B

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BearAndStrings {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String inputString = scanner.next();
        List<Integer> bearStartIndices = new ArrayList<>();

        long stringLength = inputString.length();
        long leftOptions = 1, rightOptions, totalCount = 0;

        // Find all start indices of "bear" substrings
        int index = inputString.indexOf("bear");
        while (index != -1) {
            bearStartIndices.add(index + 1);
            index = inputString.indexOf("bear", index + 1);
        }

        for (int i = 0; i < bearStartIndices.size(); i++) {
            rightOptions = stringLength - bearStartIndices.get(i) - 2;
            if (i > 0) {
                leftOptions = bearStartIndices.get(i - 1) + 1;
            }
            leftOptions = bearStartIndices.get(i) - leftOptions + 1;
            totalCount += (leftOptions * rightOptions);
        }

        System.out.println(totalCount);
    }
}
