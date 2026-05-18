package Array;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        String[] arr = { "madam", "hello", "racecar", "java", "level" };

        Arrays.stream(arr)
                .filter(Solution::isPalindrome)
                .forEach(System.out::println);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}