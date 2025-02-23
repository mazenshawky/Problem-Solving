// https://codeforces.com/contest/66/problem/B

import java.util.Scanner;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        int maxWateredSections = 0;
        
        for (int i = 0; i < n; i++) {
            int left = i, right = i;
            
            while (left > 0 && heights[left] >= heights[left - 1]) {
                left--;
            }
            
            while (right < n - 1 && heights[right] >= heights[right + 1]) {
                right++;
            }
            
            maxWateredSections = Math.max(maxWateredSections, right - left + 1);
        }
        
        System.out.println(maxWateredSections);
        
        scanner.close();
    }
}
