// Problem: Dynamic Array
// Topic: Data Structures / Vectors
// Time Complexity: O(N + Q) - initializes N lists and processes Q queries in O(1) each
// Space Complexity: O(N) - stores N dynamic lists and query responses

import java.util.*;

public class Solution {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else if (type == 2) {
                List<Integer> seq = arr.get(idx);
                lastAnswer = seq.get(y % seq.size());
                answers.add(lastAnswer);
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        int n = 2;
        List<List<Integer>> queries = Arrays.asList(
            Arrays.asList(1, 0, 5),
            Arrays.asList(1, 1, 7),
            Arrays.asList(1, 0, 3),
            Arrays.asList(2, 1, 0),
            Arrays.asList(2, 1, 1)
        );
        System.out.println("Dynamic Array Output: " + dynamicArray(n, queries));
    }
}