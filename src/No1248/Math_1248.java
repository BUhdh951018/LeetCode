package No1248;

public class Math_1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int len = nums.length;
        int[] odd = new int[len + 2];
        int ans = 0, cnt = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] % 2 == 1) {
                odd[cnt++] = i;
            }
        }

        odd[0] = -1;
        odd[cnt++] = len;
        for (int i = 1; i < cnt - k; i++) {
            ans += (odd[i] - odd[i - 1]) * (odd[i + k] - odd[i + k - 1]);
        }

        return ans;
    }
}
