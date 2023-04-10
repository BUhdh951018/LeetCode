package No56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_56 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });
        List<int[]> res = new ArrayList<>();
        int[] first = intervals[0];
        res.add(first);
        for (int[] cur : intervals) {
            int curLeft = cur[0], curRight = cur[1];
            if (curLeft >= first[0] && curRight <= first[1])
                continue;
            if (curLeft <= first[1] && curRight >= first[1]) {
                first[1] = curRight;
                continue;
            }
            if (curLeft > first[0]) {
                res.add(cur);
                first = cur;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
