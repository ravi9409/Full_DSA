package BinarySearch;

public class CountOccurance {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 60, 60, 60, 70 };
        int target = 60;
        int first = indexOfFirstElementIfSorted(a, target, 0, a.length - 1);
        int last = indexOfLastElementIfSorted(a, target, 0, a.length - 1);
        System.out.println(last - first + 1);
    }

    public static int indexOfFirstElementIfSorted(int[] num, int target, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (target > num[mid]) {
            return indexOfFirstElementIfSorted(num, target, mid + 1, high);
        } else if (target < num[mid]) {
            return indexOfFirstElementIfSorted(num, target, low, mid - 1);
        } else {
            // Target matches num[mid]
            // Check if it's the first occurrence
            if (mid == 0 || num[mid - 1] != num[mid]) {
                return mid;
            } else {
                return indexOfFirstElementIfSorted(num, target, low, mid - 1);
            }
        }
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
