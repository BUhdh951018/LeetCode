package No769;

/**
 * Name: Donghang He
 * Date: 2022/12/14 1:48 下午
 * Description:
 */
public class Array_769 {
    public int maxChunksToSorted(int[] arr) {
        int res = 1, m = 0;
        for (int i = 0; i < arr.length; i++) {
            m = Math.max(m, arr[i]);
            if (m == i)
                res++;
        }

        return res;
    }
}
