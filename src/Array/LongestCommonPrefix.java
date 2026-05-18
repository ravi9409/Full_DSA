package Array;

import java.util.Arrays;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = { "bat", "bag", "bank", "band" };
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < Math.min(first.length, last.length); i++) {
            if (first[i] != last[i]) {
                break;
            } else {
                sb.append(first[i]);
            }
        }
        return sb.toString();
    }

}