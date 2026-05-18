package Array;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 4, 1, 2 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[nums.length + i] = nums[i];
        }
        return arr;
    }

}
