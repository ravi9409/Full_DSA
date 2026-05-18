package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(253));
    }

    public static int sumOfDigit(int num) {
        if (num != 0) {
            return num % 10 + sumOfDigit(num / 10);
        }
        return 0;
        // int sum=0;
        // while(num!=0){
        // sum=sum+num%10;
        // num=num/10;
        // }
        // return sum;
    }
}
