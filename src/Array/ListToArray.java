package Array;

import java.util.ArrayList;
import java.util.List;

class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Convert List to Array
        Integer[] arr = list.toArray(new Integer[0]);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
