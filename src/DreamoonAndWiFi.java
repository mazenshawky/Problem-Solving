// https://codeforces.com/problemset/problem/476/B

import java.util.Scanner;

public class DreamoonAndWiFi {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String commandsSend = scanner.nextLine();
        String commandsRecognized = scanner.nextLine();

        int requiredFinishPosition = getPosition(commandsSend);

        int deliveredFinishPosition = 0;
        int questionMarksCount = 0;
        for (char c : commandsRecognized.toCharArray()) {
            switch (c) {
                case '+' ->
                    deliveredFinishPosition++;
                case '-' ->
                    deliveredFinishPosition--;
                case '?' ->
                    questionMarksCount++;
                default ->
                    throw new AssertionError();
            }
        }

        double percentage;
        if (questionMarksCount == 0) {
            if (requiredFinishPosition == deliveredFinishPosition) {
                percentage = 1;
            } else {
                percentage = 0;
            }
        } else {
            String[] patterns = generatePatternsUsingTruthTable(questionMarksCount);
            percentage = calculateProbability(requiredFinishPosition - deliveredFinishPosition, patterns);
        }
        System.out.println(percentage);
    }

    public static int getPosition(String pattern) {
        int position = 0;
        for (char c : pattern.toCharArray()) {
            switch (c) {
                case '+' ->
                    position++;
                case '-' ->
                    position--;
                default ->
                    throw new AssertionError();
            }
        }
        return position;
    }

    public static String[] generatePatternsUsingTruthTable(int n) {
        int rows = (int) Math.pow(2, n);

        String[] patterns = new String[rows];

        // Loop through each possible combination (0 to 2^n - 1)
        for (int i = 0; i < rows; i++) {
            // Convert the integer 'i' to binary string and pad it with leading zeros to n digits
            String binary = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');

            String formattedRow = binary.replace('0', '-').replace('1', '+');

            patterns[i] = formattedRow;
        }

        return patterns;
    }

    public static double calculateProbability(int neededPatternPosition, String[] patterns) {
        int validPattern = 0;
        for (String pattern : patterns) {
            if (getPosition(pattern) == neededPatternPosition) {
                validPattern++;
            }
        }
        return (double) validPattern / patterns.length;
    }
}
