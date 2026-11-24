// Problem: Compare the Triplets
// Topic: Basic Implementation
// Time Complexity: O(1) - fixed 3-element comparison loop
// Space Complexity: O(1) - constant space for two score counters

import java.util.*;

public class Solution {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        System.out.println("Scores (Alice, Bob): " + compareTriplets(a, b)); // Expected: [1, 1]
    }
}