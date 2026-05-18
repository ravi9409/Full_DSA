package String;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = "bruhxgr";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int l = 0;
        int r = 1;
        int n = s.length();
        int sum = -1;
        while (r < n) {
            if (s.charAt(l) != s.charAt(r)) {
                r++;
            } else {
                sum = r - l;
                break;
            }
        }
        if (s.length() % sum == 0)
            return true;
        else
            return false;
    }

}
