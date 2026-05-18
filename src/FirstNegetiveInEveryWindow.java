import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class FirstNegetiveInEveryWindow {
    public static void main(String[] args) {
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        System.out.println(firstNegInt(arr, k));
    }

    public static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices of negative numbers

        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0)
                deque.add(i);
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Result for the previous window
            list.add(deque.isEmpty() ? 0 : arr[deque.peek()]);

            // Remove indices that are outside the new window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }

            // Add current element if negative
            if (arr[i] < 0)
                deque.add(i);
        }

        // Result for the last window
        list.add(deque.isEmpty() ? 0 : arr[deque.peek()]);

        return list;
    }
}
