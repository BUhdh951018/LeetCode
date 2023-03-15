package No48;

/**
 * Name: Donghang He
 * Date: 2023/2/16 6:54 下午
 * Description:
 */
public class basic_48 {
    // 先右对称轴，再水平
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        /* { 1, 2, 3
             4, 5, 6
             7, 8, 9 }
         */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        /* { 1, 4, 7
             2, 5, 8
             3, 6, 9 }
         */

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
    }
}
