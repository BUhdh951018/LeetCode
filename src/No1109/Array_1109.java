package No1109;

/**
 * Name: Donghang He
 * Date: 2023/3/14 7:09 下午
 * Description:
 */
public class Array_1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        int[] diff = new int[n];

        for (int[] book : bookings) {
            int i = book[0];
            int j = book[1];
            diff[i - 1] += book[2];
            if (j < n)
                diff[j] -= book[2];
        }

        res[0] = diff[0];
        for (int i = 1; i < n; i++)
            res[i] = res[i - 1] + diff[i];

        return res;
    }
}
