package No240;

/**
 * Name: Donghang He
 * Date: 2022/12/12 12:55 下午
 * Description:
 */
public class Array_240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length, n = matrix[0].length;

        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (target == matrix[row][col])
                return true;
            else if (target > matrix[row][col])
                row++;
            else
                col--;
        }


        return false;
    }
}
