package No48;

/**
 * Name: Donghang He
 * Date: 2023/2/21 1:42 下午
 * Description:
 */
public class Rotate_48 {
    // 先竖直 再对角
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
            for(int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j -1] = temp;
            }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = temp;
            }
    }
}
