// https://codeforces.com/problemset/problem/208/A

import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String dubstepSong = scanner.nextLine();

        String originalSong = dubstepSong.replace("WUB", " ").trim();

        originalSong = originalSong.replaceAll("\\s+", " ");

        System.out.println(originalSong);
    }
}
