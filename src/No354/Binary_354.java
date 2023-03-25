package No354;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Name: Donghang He
 * Date: 2023/3/24 6:27 下午
 * Description:
 */
public class Binary_354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o2[1] - o1[1] : o1[0] - o2[0];
            }
        });

        int n = envelopes.length;
        int[] height = new int[n];
        int i = 0;
        for (int[] e : envelopes) {
            height[i++] = e[1];
        }

        return LIS(height);
    }

    private int LIS(int[] nums) {
        int n = nums.length;
        int[] heap = new int[n];

        int res = 0;
        for (int num : nums) {
            int left = 0, right = res;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (num < heap[mid])
                    right = mid;
                else if (num > heap[mid])
                    left = mid + 1;
                else right = mid;
            }

            if (left == res)
                res++;
            heap[left] = num;
        }
        return res;
    }
}
