package No315;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/17 4:37 下午
 * Description:
 */
public class Merge_315 {

    private class Pair {
        int val, index;
        Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    private Pair[] temp;
    private int[] count;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        Pair[] num = new Pair[n];
        count = new int[n];
        temp = new Pair[n];
        for (int i = 0; i < nums.length; i++)
            num[i] = new Pair(nums[i], i);

        sort(num, 0, n - 1);
        List<Integer> res = new ArrayList<Integer>();
        for (int c : count)
            res.add(c);
        return res;
    }

    private void sort(Pair[] num, int left, int right) {
        if (left == right)
            return;

        int mid = left + (right - left) / 2;

        sort(num, left, mid);
        sort(num, mid + 1, right);

        merge(num, left, mid, right);
    }

    private void merge(Pair[] num, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            temp[i] = num[i];
        }

        int l = lo, r = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (l == mid + 1)
                num[i] = temp[r++];
            else if (r == hi + 1) {
                num[i] = temp[l++];
                count[num[i].index] += r - mid - 1;
            } else if (temp[l].val > temp[r].val) {
                num[i] = temp[r++];
            } else {
                num[i] = temp[l++];
                count[num[i].index] += r - mid - 1;
            }
        }

    }
}
