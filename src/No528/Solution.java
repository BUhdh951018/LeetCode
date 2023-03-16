package No528;

import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2023/3/15 4:23 下午
 * Description:
 */
public class Solution {

    private final Random random;
    private final int[] dp;
    private final int n;

    public Solution(int[] w) {
        random = new Random();
        n = w.length;
        dp = new int[n];

        dp[0] = w[0];
        for (int i = 1; i < n; i++)
            dp[i] = dp[i - 1] + w[i];
    }

    public int pickIndex() {
        int target = random.nextInt(dp[n - 1]) + 1;

        int left = 0, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (dp[mid] == target) {
                left = mid;
                break;
            }
            if (dp[mid] < target) {
                left = mid + 1;
            } else
                right = mid;
        }

        return left;
    }
}
