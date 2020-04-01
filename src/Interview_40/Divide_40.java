package Interview_40;

public class Divide_40 {
    public int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];

        while (true) {
            while (a[++i] < v) {
                if (i == hi) {
                    break;
                }
            }

            while (a[--j] > v) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, lo, j);

        return j;
    }

    private void swap(int[] a, int lo, int hi) {
        int temp = a[lo];
        a[lo] = a[hi];
        a[hi] = temp;
    }

    public void partitionArray(int[] arr, int lo, int hi, int k) {
        int m = partition(arr, lo, hi);

        if (k == m) {
            return;
        } else if (k < m) {
            partitionArray(arr, lo, m - 1, k);
        } else {
            partitionArray(arr, m + 1, hi, k);
        }

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0){
            return new int[0];
        } else if (arr.length <= k) {
            return arr;
        }

        partitionArray(arr, 0 , arr.length - 1, k);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}
