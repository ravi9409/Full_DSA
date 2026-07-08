package com.lambda.Collector;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        left[0] = 1;
        for (int i = 1; i < n - 1; i++)
            left[i] = left[i - 1] * nums[i-1];

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];

        for (int i = 0; i < n - 1; i++)
            result[i] = left[i] * right[i];

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums1)));

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}
