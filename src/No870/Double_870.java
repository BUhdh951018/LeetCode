package No870;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Name: Donghang He
 * Date: 2023/3/15 4:43 下午
 * Description:
 */
public class Double_870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;

        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (int[] a, int[] b) -> (b[1] - a[1])
        );

        for (int i = 0; i < n; i++)
            queue.offer(new int[]{i, nums2[i]});

        int[] res = new int[n];
        Arrays.sort(nums1);

        int left = 0, right = n - 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int index = cur[0], power = cur[1];
            if (power < nums1[right]) {
                res[index] = nums1[right--];
            } else
                res[index] = nums1[left++];
        }

        return res;
    }
}
