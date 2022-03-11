package No215;

import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2022/3/11 4:54 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class QuickSort {
    Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length -1, nums.length - k);
    }
    public int quickSort(int[] a, int p, int r, int index) {
        int q = randomizedPartition(a, p, r);

        if (q == index) {
            return a[q];

        } else {
            return q < index ? quickSort(a, q + 1, r, index) : quickSort(a, p, q - 1, index);
        }
    }

    public int randomizedPartition(int[] a, int p, int r) {
        int i = random.nextInt(r - p + 1) + p;
        swap(a, r, i);
        return partition(a, p, r);
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (a[j] <= x) {
                i += 1;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
