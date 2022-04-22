package No435;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/22 3:04 下午
 * Description:
 */
public class Greedy_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int m = intervals.length;
        int res = 0;
        int end = intervals[0][1];
        for (int i = 1; i < m; i++) {
            if (intervals[i][0] < end) {
                continue;
            }
            end = intervals[i][1];
            res++;
        }
        return res - m;
    }
}
