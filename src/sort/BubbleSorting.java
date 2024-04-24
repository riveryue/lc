package sort;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int a[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}
