package Array.Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 1};
        int winSize = 3;
        System.out.println(containsNearbyDuplicate(array, winSize));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
        // if already present → duplicate within window
        if (set.contains(nums[i])) {
            return true;
        }

        set.add(nums[i]);

        // maintain window size k
        if(set.size()>k){
            set.remove(nums[i - k]);
        }
    }

    return false;
}
}

