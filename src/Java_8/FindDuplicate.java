package Java_8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 2, 5, 6, 1 };
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> iterate : map.entrySet()) {
            int key = iterate.getKey();
            int val = iterate.getValue();
            System.out.println("Key " + key + " Value " + val);
        }
    }
}
