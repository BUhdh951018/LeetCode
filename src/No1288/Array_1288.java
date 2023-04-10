package No1288;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/4/9 7:14 下午
 * Description:
 */
public class Array_1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });

        int first = intervals[0][0], second = intervals[0][1];

        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            if (cur[0] >= first && cur[1] <= second)
                res++;
            if (cur[0] <= second && cur[1] >= second)
                second = cur[1];
            if (second < cur[0]) {
                first = cur[0];
                second = cur[1];
            }
        }
        return intervals.length - res;
    }
}
