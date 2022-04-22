package No452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Name: Donghang He
 * Date: 2022/4/22 3:24 下午
 * Description:
 */
public class Greedy_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Integer.compare(o1[1], o2[1]));
            }
        });
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int res = 1;
        int len = points.length;
        int end = points[0][1];
        for (int i = 1; i < len; i++) {
            if (points[i][0] <= end)
                continue;
            res++;
            end = points[i][1];
        }

        return res;
    }
}
