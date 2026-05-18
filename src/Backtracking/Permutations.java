package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, used);
    }

    static void backtrack(List<Integer> current, int[] nums, boolean[] used) {

        // ✅ Base case
        if (current.size() == nums.length) {
            System.out.println(current);
            return;
        }

        // 🔄 Try all choices
        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            current.add(nums[i]);
            used[i] = true;
            backtrack(current, nums, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}