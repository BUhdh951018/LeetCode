package No486;

/**
 * Name: Donghang He
 * Date: 2023/3/27 9:17 下午
 * Description:
 */
public class DP_486 {
    public boolean PredictTheWinner(int[] nums) {
        return stoneGame(nums) >= 0;
    }

    private int stoneGame(int[] nums) {
        int n = nums.length;
        Pair[][] dp = new Pair[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new Pair(0, 0);
                if (i == j) {
                    dp[i][j].first = nums[i];
                }
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                int left = nums[i] + dp[i + 1][j].second;
                int right = nums[j] + dp[i][j - 1].second;
                if (left > right) {
                    dp[i][j].first = left;
                    dp[i][j].second = dp[i + 1][j].first;
                } else {
                    dp[i][j].first = right;
                    dp[i][j].second = dp[i][j - 1].first;
                }
            }
        }
        Pair res = dp[0][n - 1];
        return res.first - res.second;
    }

    private class Pair{
        int first, second;
        Pair(int fir, int sec) {
            first = fir;
            second = sec;
        }
    }
}
