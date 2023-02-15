package No4;

public class solution_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int[] nums;
        int m = nums1.length;
        int n = nums2.length;
        nums = new int[m + n];

        if (m == 0) {
            if (n % 2 == 0) {
                return (nums2[n / 2 - 1] + nums2[n / 2]) / 2.0;
            } else {

                return nums2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (nums1[m / 2 - 1] + nums1[m / 2]) / 2.0;
            } else {
                return nums1[m / 2];
            }
        }

        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {
                while (j != n) {
                    nums[count++] = nums2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                nums[count++] = nums1[i++];
            } else {
                nums[count++] = nums2[j++];
            }
        }

        if (count % 2 == 0) {

            return (nums[count / 2 - 1] + nums[count / 2]) / 2.0;
        } else {
            return nums[count / 2];
        }*/

        //another
        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;
        int aStart = 0, bStart = 0;
        int right = -1;
        int left = -1;
        for (int i = 0; i <= len/2; i++){
            left = right;
            if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])){
                right = nums1[aStart++];
            } else {
                right = nums2[bStart++];
            }
        }

        if ((len & 1) == 0) {
            return (left + right) / 2.0;
        } else {
            return right;
        }
    }

    public static void main(String[] args){
        int[] i = {1,3};
        int[] j = {2};
        double result = findMedianSortedArrays(i, j);
        System.out.println(result);
    }
}
