package Offer13;

public class DFS_13 {
    int m, n, k;
    boolean[][] visit;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;

        this.visit = new boolean[m][n];

        return dfs(0, 0, 0, 0);
    }

    private int dfs(int i, int j, int n_i, int n_j) {
        if (i < 0 || i >= m || j < 0 || j >= n || n_i + n_j > k || visit[i][j])
            return 0;

        visit[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? n_i + 1 : n_i - 8, n_j) + dfs(i, j +1, n_i, (j + 1) % 10 != 0 ? n_j + 1 : n_j - 8);
    }
}
