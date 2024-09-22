// https://codeforces.com/contest/950/problem/A

import java.util.Scanner;
 
public class LeftHandersRightHandersAndAmbidexters {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int leftHanders = scanner.nextInt();
        int rightHanders = scanner.nextInt();
        int ambidexters = scanner.nextInt();
 
        while (ambidexters > 0) {
            if (leftHanders < rightHanders) {
                leftHanders++;
            } else {
                rightHanders++;
            }
            ambidexters--;
        }
 
        int maxPairs = Math.min(leftHanders, rightHanders) * 2;
 
        System.out.println(maxPairs);
    }
}