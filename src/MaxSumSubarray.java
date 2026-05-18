public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 5, 1, 3, 2 };
        System.out.println(maxSumSubarray(nums, 7));

    }

    public static int maxSumSubarray(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        int right = 0;
        for (; right < nums.length; right++) {
            // Step 1: Expand window
            sum += nums[right];
            // Step 2: Shrink if condition breaks
            while (sum > k) {
                sum -= nums[left];
                left++;
            }
            // Step 3: Update answer
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
