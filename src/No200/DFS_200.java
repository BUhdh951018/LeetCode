package No200;

public class DFS_200 {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++){

            for (int j = 0; j < grid[0].length; j++) {
                //System.out.println(grid[i][j]);
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        int[] di = {0, 0, 1, -1};
        int[] dj = {1, -1, 0, 0};
        for (int m = 0; m < 4; m++) {
            int next_i = i + di[m], next_j = j + dj[m];
            dfs(grid, next_i, next_j);
        }
    }
}
