// https://codeforces.com/problemset/problem/6/B

import java.util.HashSet;
import java.util.Scanner;

public class PresidentsOffice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roomLength = scanner.nextInt();
        int roomWidth = scanner.nextInt();

        char presidentDiskColor = scanner.next().charAt(0);

        char[][] room = new char[roomLength][roomWidth];
        for (int i = 0; i < roomLength; i++) {
            room[i] = scanner.next().toCharArray();
        }

        HashSet<Character> presidentDeputies = new HashSet<>();

        // Directions: up, down, left, right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // If the current cell is (1, 1) (center of the grid), its neighbors are:
        // Up: (0, 1) → dx = -1, dy = 0
        // Down: (2, 1) → dx = 1, dy = 0
        // Left: (1, 0) → dx = 0, dy = -1
        // Right: (1, 2) → dx = 0, dy = 1

        for (int i = 0; i < roomLength; i++) {
            for (int j = 0; j < roomWidth; j++) {
                if (room[i][j] == presidentDiskColor) {
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];

                        if (ni >= 0 && ni < roomLength && nj >= 0 && nj < roomWidth) {
                            char neighborColor = room[ni][nj];
                            if (neighborColor != '.' && neighborColor != presidentDiskColor) {
                                presidentDeputies.add(neighborColor);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(presidentDeputies.size());
    }
}
