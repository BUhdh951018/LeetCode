package No56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if(x[0] < y[0]){
                    return -1;
                } else if(x[0] > y[0]){
                    return 1;
                } else {
                    return 0;
                }
            }
        });

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
                System.out.println(list);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
