// https://codeforces.com/contest/535/problem/B

import java.util.PriorityQueue;
import java.util.Scanner;

public class TavasAndSaDDas {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // Create a priority queue (min-heap) to store lucky numbers in ascending order
        PriorityQueue<Long> luckyNumbers = new PriorityQueue<>();

        // Start generating lucky numbers from an empty number
        generateLuckyNumbers(luckyNumbers, 0);

        int myLuckyNumber = scanner.nextInt();

        int i = 1;
        while (!luckyNumbers.isEmpty()) {
            long number = luckyNumbers.poll();  // Get the smallest element
            if (number == myLuckyNumber) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    // Recursive method to generate lucky numbers and insert into the priority queue
    public static void generateLuckyNumbers(PriorityQueue<Long> queue, long currentNumber) {
        if (currentNumber != 0) {
            queue.add(currentNumber);  // Add number to the priority queue if it's not zero
        }
        if (currentNumber * 10 + 4 <= 1_000_000_000) {
            generateLuckyNumbers(queue, currentNumber * 10 + 4);  // Add a digit '4'
        }
        if (currentNumber * 10 + 7 <= 1_000_000_000) {
            generateLuckyNumbers(queue, currentNumber * 10 + 7);  // Add a digit '7'
        }
    }
}
