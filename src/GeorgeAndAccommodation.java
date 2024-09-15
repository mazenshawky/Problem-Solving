// https://codeforces.com/contest/467/problem/A

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int availableRooms = 0;
        int roomsCount = scanner.nextInt();

        for (int i = 0; i < roomsCount; i++) {
            int peopleCount = scanner.nextInt();
            int roomCapacity = scanner.nextInt();

            if(roomCapacity - peopleCount >= 2) {
                availableRooms++;
            }
        }
        System.out.println(availableRooms);
    }
}
