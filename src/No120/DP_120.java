package No120;

import java.util.Iterator;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/5/4 5:58 下午
 * Description:
 */
public class DP_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int res = Integer.MAX_VALUE;
        for (int num : dp[triangle.size() - 1]) {
            System.out.println(num);
            res = Math.min(num, res);
        }
        return res;
    }
}
