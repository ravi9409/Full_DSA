package Array.Sliding_Window;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] array = new int[]{1,12,-5,-6,50,3};
        int winSize = 4;
        System.out.println(findMaxSum(array, winSize));
    }

    public static double findMaxSum(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        int l = 0;
        int r = k - 1;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        maxSum = sum;
        while (r < nums.length - 1) {
            sum = sum + nums[++r];
            sum = sum - nums[l++];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }
}
