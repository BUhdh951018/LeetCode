package No53;

public class Pre_53 {
    public int maxSunArray(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n + 1];
        pre[0] = 0;
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + nums[i - 1];
        }

        int res = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, pre[i]);
            res = Math.max(res, pre[i + 1] - min);
        }

        return res;
    }
}
