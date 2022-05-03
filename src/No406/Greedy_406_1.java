package No406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/4/22 4:54 下午
 * Description:
 */
public class Greedy_406_1 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> (o1[0] != o2[0]) ? (o2[0] - o1[0]) : (o1[1] - o2[1]));
        List<int[]> list = new ArrayList<>();
        for (int[] temp : people) {
            list.add(temp[1], temp);
        }

        return list.toArray(new int[][]{});
    }
}
