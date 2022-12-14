package No766;

/**
 * Name: Donghang He
 * Date: 2022/12/14 1:17 下午
 * Description:
 */
public class Array_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (!check(matrix, matrix[0][i], i, 0))
                return false;
        }

        for (int i = 0; i < m; i++)
            if (!check(matrix, matrix[i][0], 0, i))
                return false;


        return true;
    }

    private boolean check(int[][] matrix, int value, int col, int row) {
        if (col >= matrix[0].length || row >= matrix.length)
            return true;
        if (value != matrix[row][col])
            return false;

        return check(matrix, value, col + 1, row + 1);
    }

}
