package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "f11";
        String t = "b23";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        boolean flag = true;
        Map<Character, Character> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                if(hashMap.get(s.charAt(i)) != t.charAt(i)){
                    flag = false;
                }
            } else {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return flag;
    }
}
