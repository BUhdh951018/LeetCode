package No59;

/**
 * Name: Donghang He
 * Date: 2023/3/14 8:50 下午
 * Description:
 */
public class Array_59 {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int upper = 0, lower = n - 1;
        int left = 0, right = n - 1;

        int count = 1;

        while (count <= n * n) {
            if (upper <= lower) {
                for (int i = left; i <= right; i++)
                    matrix[upper][i] = count++;
                upper++;
            }

            if (left <= right) {
                for (int i = upper; i <= lower; i++)
                    matrix[i][right] = count++;
                right--;
            }

            if (upper <= lower) {
                for (int i = right; i >= left; i--)
                    matrix[lower][i] = count++;
                lower--;
            }

            if (left <= right) {
                for (int i = lower; i >= upper; i--)
                    matrix[i][left] = count++;
                left++;
            }
        }

        return matrix;
    }
}
