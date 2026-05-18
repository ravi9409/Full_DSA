package BinarySearch;

public class CheckForAnElement {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60, 60, 60, 70 };
        int target = 60;
        System.out.println(searchForElement(a, target));
    }

    public static int searchForElement(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
        }
        return -1;
    }

}
