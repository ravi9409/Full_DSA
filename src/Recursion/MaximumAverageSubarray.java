package Recursion;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, -10 };
        int k = 15;
        System.out.println(longestSubarray(nums, k));
    }

    public static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // Step 1: Expand
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            // Step 3: Update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

}
