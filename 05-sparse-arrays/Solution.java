// Problem: Sparse Arrays
// Topic: Hash Maps / Strings
// Time Complexity: O(N + Q) - builds frequency map in O(N) and answers Q queries in O(1) each
// Space Complexity: O(N) - stores up to N unique strings in HashMap

import java.util.*;

public class Solution {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : stringList) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        List<Integer> results = new ArrayList<>();
        for (String q : queries) {
            results.add(freqMap.getOrDefault(q, 0));
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");
        System.out.println("Query Counts: " + matchingStrings(strings, queries)); // Expected: [2, 1, 0]
    }
}