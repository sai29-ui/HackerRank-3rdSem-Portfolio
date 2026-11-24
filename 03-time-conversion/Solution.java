// Problem: Time Conversion
// Topic: Strings & Logic
// Time Complexity: O(1) - fixed-length string slicing and formatting
// Space Complexity: O(1) - constant extra space used

public class Solution {
    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }
        return String.format("%02d%s", hour, rest);
    }

    public static void main(String[] args) {
        System.out.println("24-Hour Time: " + timeConversion("07:05:45PM")); // Expected: 19:05:45
    }
}