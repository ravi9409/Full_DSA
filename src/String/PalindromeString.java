package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(palindromeString(s));
    }

    public static boolean palindromeString(String s) {
        int l = 0;
        int r = s.length() - 1;
        boolean flag = true;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
