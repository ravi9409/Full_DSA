package Array.Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s="abcabdeef";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0,maxSize=0;
        for (int r=0;r<s.length();r++){
            while (set.contains(s.charAt(r))){
               set.remove(s.charAt(left));
               left++;
            }
            set.add(s.charAt(r));
            maxSize=Math.max(maxSize,set.size());
        }
        return maxSize;
    }
}
