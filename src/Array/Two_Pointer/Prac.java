package Array.Two_Pointer;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int[] nums1 = new int[]{10,20,20,40,0,0};
        int m = 4;
        int[] nums2 =new int[]{1,2};
        int n = 2;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        return nums1;
    }
}
