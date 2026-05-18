package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(7));
    }

    public static int fibonacciNumber(int num) {
        if (num <= 1)
            return num;
        int curr = 0;
        int prev2 = 0, prev1 = 1;

        for (int i = 2; i <= num; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
