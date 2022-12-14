package No287;

/**
 * Name: Donghang He
 * Date: 2022/12/13 11:19 上午
 * Description:
 */
public class Array_287 {
    public int findDuplicate(int[] nums) {
        int l = 1, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid)
                    cnt++;
            }

            if (cnt <= mid)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return l;
    }
}
