package No300;

import java.util.Arrays;

public class Dichotomy_300 {
    public int lengthOfLIS(int[] nums) {
        int[] heap = new int[nums.length];
        int res = 0;
        for (int num : nums) {
            int left = 0, right = res;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (heap[mid] > num) {
                    right = mid;
                } else if (heap[mid] < num)
                    left = mid + 1;
                else
                    right = mid;
            }

            if (left == res)
                res++;
            heap[left] = num;
        }

        return res;
    }
}
