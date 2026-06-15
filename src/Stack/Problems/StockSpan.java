package Stack.Problems;

import java.util.ArrayDeque;
import java.util.Arrays;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }

    public static int[] stockSpan(int a[]) {
        int n = a.length;
        int s[] = new int[n];
        s[0] = 1;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(0);
        for (int i = 1; i < a.length ; i++) {
            while (!arrayDeque.isEmpty()) {
                int top = arrayDeque.peek();
                if (a[top] > a[i]) {
                    break;
                } else {
                    arrayDeque.pop();
                }
            }
            if (arrayDeque.isEmpty()) {
                s[i] = i;
            } else {
                s[i] = i- arrayDeque.peek();
            }
            arrayDeque.push(i);
        }
        return s;
    }
}
