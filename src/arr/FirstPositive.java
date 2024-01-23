package arr;

import java.util.Arrays;

public class FirstPositive {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 9, -5};
        System.out.println(firstMissingPositive(arr));
    }

    private static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                nums[i] = len + 1;
            }
        }
        for (int i = 0; i < len; i++) {
            int num = Math.abs(nums[i]);
            if (num <= len) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
