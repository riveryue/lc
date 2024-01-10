package arr;

public class MaxSubArr {

    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
    private static int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int n : nums) {
            pre = Math.max(pre + n, n);
            max = Math.max(max, pre);
        }
        return max;
    }
}
