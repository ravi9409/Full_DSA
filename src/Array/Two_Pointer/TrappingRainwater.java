package Array.Two_Pointer;

import java.util.Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] a={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }

    public static int trap(int[] height) {
        int maxLeft=Integer.MIN_VALUE;
        int maxRight=Integer.MIN_VALUE;
        int sum=0;
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        for (int i=0;i<height.length;i++){
            maxLeft=Math.max(maxLeft,height[i]);
            left[i]=maxLeft;
        }
        for (int i=height.length-1;i>=0;i--){
            maxRight=Math.max(maxRight,height[i]);
            right[i]=maxRight;
        }
        for (int i=0;i<height.length;i++){
            sum=sum+Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }

}
