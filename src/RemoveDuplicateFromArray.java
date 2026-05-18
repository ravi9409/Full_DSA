import java.util.HashMap;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] a = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(a));
    }

    public static int missingNumber(int[] nums) {
        int count = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], 1);
        }
        for (int i = 0; i < count; i++) {
            if (!hashMap.containsKey(i)) {
                return i;
            }
        }
        return 1;
    }
}
