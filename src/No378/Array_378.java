package No378;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/12/12 1:15 下午
 * Description:
 */
public class Array_378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] res = new int[n * n];
        int temp = 0;
        for (int[] mat : matrix)
            for (int num : mat)
                res[temp++] = num;

        Arrays.sort(res);
        return res[k - 1];
    }
}
