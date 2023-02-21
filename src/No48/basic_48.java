package No48;

/**
 * Name: Donghang He
 * Date: 2023/2/16 6:54 下午
 * Description:
 */
public class basic_48 {
    // 先水平 再对角
    public void rotate(int[][] matrix) {
        int len = matrix[0].length;
        int temp = 0;
        for (int i = 0; i < len / 2; i++)
            for (int j = 0; j < len; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - i - 1][j];
                matrix[len - i - 1][i] = temp;
            }

        for (int i = 0; i < len; i++)
            for (int j = 0; j < i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }
}
