package Array.Two_Pointer;

public class ValidPalindrome2 {
     public static void main(String[] args) {
        String s = "abac";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return checkPalindrome(s, l + 1, r) || checkPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
