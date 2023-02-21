package No56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_56 {
    public int[][] merge(int[][] intervals) {

        // 数组首位排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);

        int[] curr_interval = intervals[0];
        List<int[]> list = new ArrayList<>();
        list.add(curr_interval);
        for(int[] interval: intervals) {

            int curr_end = curr_interval[1];

            int next_begin = interval[0];
            int next_end = interval[1];

            if(curr_end >= next_begin) {
                curr_interval[1] = Math.max(curr_end, next_end);
            } else {
                curr_interval = interval;
                list.add(curr_interval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
