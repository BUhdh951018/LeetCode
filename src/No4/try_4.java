package No4;


import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/2/14 4:09 下午
 * Description:
 */
public class try_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m + n];
        System.arraycopy(nums1, 0, res, 0, m);

        System.arraycopy(nums2, 0, res, m, m + n - m);

        Arrays.sort(res);
        if ((m + n) % 2 != 0)
            return res[(m + n) / 2];
        else return (double)(res[(m + n) / 2] + res[(m + n) / 2 - 1]) / 2;

    }
}
