package No542;

public class DP_542 {
    public int[][] updateMatrix(int[][] matrix) {
        int col = matrix[0].length, row = matrix.length;

        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                ans[i][j] = col + row;
            }

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0)
                    ans[i][j] = 0;
                else {
                    if (i > 0)
                        ans[i][j] = Math.min(ans[i][j], ans[i - 1][j] + 1);
                    if (j > 0)
                        ans[i][j] = Math.min(ans[i][j], ans[i][j - 1] + 1);
                }
            }

        for (int i = row - 1; i >= 0; i--)
            for (int j = col - 1; j >= 0; j--) {
                if (i < row - 1)
                    ans[i][j] = Math.min(ans[i][j], ans[i + 1][j] + 1);
                if (j < col - 1)
                    ans[i][j] = Math.min(ans[i][j], ans[i][j + 1] + 1);
            }
        return ans;
    }
}
