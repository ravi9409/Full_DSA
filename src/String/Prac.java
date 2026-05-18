package String;

public class Prac {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(hasSpecialSubstring(s, 3));
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        if(s.length()==1)
            return true;
        int l = 0;
        int r = 1;
        boolean flag = false;
        while (r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                r++;
                if (k == r) {
                    flag = true;
                    break;
                }
            } else {
                r++;
            }
        }
        return flag;
    }
}
