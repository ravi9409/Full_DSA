package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4 };
        System.out.println("New length: " + removeElement(nums, 1));
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                //i--;
            }
        }
        Integer[] removedList = list.toArray(new Integer[0]);
        for (int s1 : removedList)
            System.out.println(s1);
        return list.size();
    }
}
