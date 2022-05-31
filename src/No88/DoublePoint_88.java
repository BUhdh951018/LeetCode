package No88;

/**
 * Name: Donghang He
 * Date: 2022/5/31 5:01 下午
 * Description:
 */
public class DoublePoint_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m + n - 1, second = n - 1;

        while (second >= 0) {
            if (m - 1 < 0)
                nums1[first--] = nums2[second--];
            else if (nums1[m - 1] < nums2[second])
                nums1[first--] = nums2[second--];
            else {
                nums1[first--] = nums1[m - 1];
                m--;
            }
        }
    }
}
