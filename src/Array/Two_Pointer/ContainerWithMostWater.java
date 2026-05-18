package Array.Two_Pointer;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] container=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(container));
    }
    public static int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int min=Integer.MAX_VALUE;
        int area=0;
        int maxArea=0;
        while (l<r){
            min=Math.min(height[l],height[r]);
            area=min*(r-l);
            maxArea=Math.max(area,maxArea);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }

}
