package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {
    
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] ans = intersection(nums1, nums2);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

     public static int[] intersection(int[] nums1, int[] nums2) {
         int total = nums1.length + nums2.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
