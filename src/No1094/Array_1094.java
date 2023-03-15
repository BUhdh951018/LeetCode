package No1094;

/**
 * Name: Donghang He
 * Date: 2023/3/14 7:20 下午
 * Description:
 */
public class Array_1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] res = new int[1001];
        int[] diff = new int[1001];

        for (int[] trip : trips) {
            int people = trip[0];
            int start = trip[1];
            int end = trip[2] - 1;
            diff[start] += people;
            if (end + 1 < 1000) {
                diff[end + 1] -= people;
            }
        }

        res[0] = diff[0];
        if (res[0] > capacity)
            return false;
        for (int i = 1; i < 1001; i++) {
            res[i] = res[i - 1] + diff[i];
            if (res[i] > capacity)
                return false;
        }

        return true;
    }
}
