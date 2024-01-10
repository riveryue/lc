package sort;

import java.util.Arrays;

/**
 * 快速排序（英语：Quicksort），又称分区交换排序（partition-exchange sort），交换排序的另一种。
 * 是一种排序算法，最早由东尼·霍尔提出
 */
public class QuickSort {

    public static void main(String[] args) {
        int a[] = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = partSort(a, left, right);
        sort(a, left, pivot - 1);
        sort(a, pivot + 1, right);
    }

    static int partSort(int[] array, int low, int high) {
        int pivot = array[low];
        while (low < high) {
            while (low < high && array[high] > pivot) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < pivot) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = pivot;
        return low;
    }

    private static void quick(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[i];
        while (i < j) {
            while (i < j && array[j] > pivot) {
                j--;
            }
            array[i] = array[j];
            while (i < j && array[i] < pivot) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        if (i > low) {
            quick(array, low, i);
        }
        if (i + 1 < high) {
            quick(array, i + 1, high);
        }
    }
}
