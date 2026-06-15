package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,1,8,2,3,7};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i]; // The element we want to insert
            int j = i - 1;

            // Keep shifting larger elements to the right to make space
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j]; // Shift element right
                j--;                 // Move pointing index to the left
            }
            
            // Insert the current element into the empty space we just created
            arr[j + 1] = current;
        }
        return arr;
    }
}
