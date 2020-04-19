package No200;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_200 {
    public int numIslands(char[][] grid) {
        if (grid == null | grid.length == 0) {
            return 0;
        }

        int len_r = grid.length;
        int len_c = grid[0].length;
        int ans = 0;

        for (int i = 0; i < len_r; i++)
            for (int j = 0; j < len_c; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i * len_c + j);

                    while (!queue.isEmpty()) {
                        int id = queue.remove();
                        int row = id / len_c;
                        int col = id % len_c;
                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            queue.add((row - 1) * len_c + col);
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 < len_r && grid[row + 1][col] == '1') {
                            queue.add((row + 1) * len_c + col);
                            grid[row + 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            queue.add(row * len_c + (col - 1));
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < len_c && grid[row][col + 1] == '1') {
                            queue.add(row * len_c + (col + 1));
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }

        return ans;
    }
}
