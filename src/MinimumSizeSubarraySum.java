public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int right = 0;
        for (; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minSum = Math.min(minSum, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minSum == Integer.MAX_VALUE ? 0 : minSum;

    }
}
