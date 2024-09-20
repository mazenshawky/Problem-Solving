// https://codeforces.com/contest/2/problem/A

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Winner {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int roundsCount = scanner.nextInt();
        Map<String, Integer> playersAndScores = new HashMap<>();
        String[] playersNames = new String[roundsCount];
        int[] playersScores = new int[roundsCount];

        // Read input and calculate total scores
        for (int i = 0; i < roundsCount; i++) {
            String playerName = scanner.next();
            int playerRoundScore = scanner.nextInt();

            playersNames[i] = playerName;
            playersScores[i] = playerRoundScore;

            // Update the player's total score
            playersAndScores.put(playerName, playersAndScores.getOrDefault(playerName, 0) + playerRoundScore);
        }

        // Find the maximum score
        int maxScore = playersAndScores.values().stream().max(Integer::compare).orElse(Integer.MIN_VALUE);

        // Determine who reached the maximum score first
        Map<String, Integer> playersRunningScores = new HashMap<>();
        for (int i = 0; i < roundsCount; i++) {
            String playerName = playersNames[i];
            int playerRoundScore = playersScores[i];

            // Update running score
            playersRunningScores.put(playerName, playersRunningScores.getOrDefault(playerName, 0) + playerRoundScore);

            // Check if this player reached the max score
            if (playersRunningScores.get(playerName) >= maxScore && playersAndScores.get(playerName) == maxScore) {
                System.out.println(playerName);
                break;
            }
        }
    }
}
