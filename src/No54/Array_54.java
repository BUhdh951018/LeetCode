package No54;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/14 8:40 下午
 * Description:
 */
public class Array_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int upper = 0, lower = m - 1;
        int left = 0, right = n - 1;
        List<Integer> res = new ArrayList<>();

        while (res.size() < m * n) {
            if (upper <= lower) {
                for (int i = left; i <= right; i++) {
                    res.add(matrix[upper][i]);
                }
                upper++;
            }

            if (left <= right) {
                for (int i = upper; i <= lower; i++)
                    res.add(matrix[i][right]);
                right--;
            }

            if (upper <= lower) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[lower][i]);
                lower--;
            }

            if (left <= right) {
                for (int i = lower; i >= upper; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
}
