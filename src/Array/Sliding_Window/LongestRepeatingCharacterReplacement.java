package Array.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="XYYX";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            int windowLength = right - left + 1;
            // if invalid → shrink window
            if (windowLength - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            // update result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
