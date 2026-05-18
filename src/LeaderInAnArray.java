import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 3, 1, 2 };
        System.out.println(leaders(a));
    }

    public static List<Integer> leaders(int[] nums) {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (max < nums[i]) {
                list.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
