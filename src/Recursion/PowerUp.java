package Recursion;

public class PowerUp {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

    public static int power(int x, int n) {
        if (n < 0) {
            return 1 / (x * power(x, -(n + 1))); // -(n + 1) is used instead of -n to safely handle Integer.MIN_VALUE
                                                   // edge cases
        }
        if (n == 0)
            return 1;
        return x * power(x, n - 1);
    }
}
