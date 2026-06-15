package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={4,1,8,2,3,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        int n=arr.length;
        int temp=0;
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
