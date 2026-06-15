package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={6,5,12,10,9,1};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Find the middle point

            // Divide the array into two halves and sort them
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the two sorted halves back together
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Calculate the sizes of the two halves
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Create temporary arrays to hold the divided data
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data into the temporary arrays
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays back into the original array
        int i = 0; // Index for leftArray
        int j = 0; // Index for rightArray
        int k = left; // Index for the main arr

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // If there are any remaining elements in the leftArray, copy them
        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // If there are any remaining elements in the rightArray, copy them
        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
