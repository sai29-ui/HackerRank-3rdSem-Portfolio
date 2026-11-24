// Problem: Diagonal Difference
// Topic: 2D Arrays / Matrices
// Time Complexity: O(N) - single pass across N rows
// Space Complexity: O(1) - only two running sum variables used

import java.util.*;

public class Solution {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        List<List<Integer>> sampleMatrix = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        );
        System.out.println("Diagonal Difference: " + diagonalDifference(sampleMatrix));
    }
}