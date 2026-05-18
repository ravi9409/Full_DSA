package BinarySearch;

public class indexOfLastElement {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 60, 60, 60, 70 };
        int target = 60;
        System.out.println(indexOfLastElementIfSorted(a, target, 0, a.length - 1));
    }

    public static int indexOfLastElementIfSorted(int[] num, int target, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (target > num[mid]) {
            return indexOfLastElementIfSorted(num, target, mid + 1, high);
        } else if (target < num[mid]) {
            return indexOfLastElementIfSorted(num, target, low, mid - 1);
        } else {
            // Target matches num[mid]
            // Check if it's the first occurrence
            if (mid == target - 1 || num[mid] != num[mid + 1]) {
                return mid;
            } else {
                return indexOfLastElementIfSorted(num, target, mid + 1, high);
            }
        }
    }
}
