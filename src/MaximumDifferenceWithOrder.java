public class MaximumDifferenceWithOrder {
    public static void main(String[] args) {
        int[] a={2,3,10,6,4,8,1};
        System.out.println(maximumValue(a));
    }

    public static int maximumValue(int[] nums){
        int max=Integer.MIN_VALUE;
        int i=0;
        for (int j=1;j<nums.length;j++){
            if(nums[j]-nums[i]>max)
                max=nums[j]-nums[i];
        }
        return max;
    }
}
