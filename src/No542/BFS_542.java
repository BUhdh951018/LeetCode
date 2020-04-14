package No542;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_542 {
    public int[][] updateMatrix(int[][] matrix) {
        int col = matrix[0].length, row = matrix.length;

        int[][] section = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = row + col;
                }
            }

        while (!queue.isEmpty()) {
            int[] c = queue.poll();
            for (int[] s: section) {
                int n_row = c[0] + s[0];
                int n_col = c[1] + s[1];
                if (n_row >= 0 && n_row < row && n_col >= 0 && n_col < col) {
                    if (matrix[n_row][n_col] >= matrix[c[0]][c[1]] + 1) {
                        matrix[n_row][n_col] =  matrix[c[0]][c[1]] + 1;
                        queue.add(new int[]{n_row, n_col});
                    }
                }
            }
        }

        return matrix;
    }
}
