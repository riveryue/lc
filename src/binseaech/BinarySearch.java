package binseaech;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {3, 8, 9, -5, 4, 30, 41};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(search(array, 30));
    }

    private static int search(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
