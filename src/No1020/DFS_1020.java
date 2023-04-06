package No1020;

/**
 * Name: Donghang He
 * Date: 2023/4/5 5:00 下午
 * Description:
 */
public class DFS_1020 {
    private int m, n;
    public int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            dfs(grid, i, n - 1);
            dfs(grid, i, 0);
        }
        for (int i = 0; i < n; i++) {
            dfs(grid, m - 1, i);
            dfs(grid, 0, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res += 1;
                }
            }
        }
        return res;
    }

    private void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n)
            return;
        if (grid[i][j] == 0)
            return;
        grid[i][j] = 0;
        dfs(grid, i, j + 1);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i - 1, j);
    }
}
