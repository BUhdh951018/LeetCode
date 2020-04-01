package No892;

public class Check_892 {
    public int surfaceArea(int[][] grid) {
        int[] row = {0, 0, 1, -1};
        int[] col = {1, -1, 0, 0};

        int len = grid.length;
        int ans = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] > 0) {
                    ans += 2;

                    for (int m = 0; m < 4; m++) {
                        int new_i = i + row[m];
                        int new_j = j + col[m];

                        int temp = 0;
                        if (0 <= new_i && new_i < len && 0 <= new_j && new_j < len) {
                            temp = grid[new_i][new_j];
                        }

                        ans += Math.max(grid[i][j] - temp, 0);
                    }
                }
            }
        }

        return ans;
    }
}
