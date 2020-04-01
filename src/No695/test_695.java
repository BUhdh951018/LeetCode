package No695;

public class test_695 {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        };
        System.out.println(new Dfs_695().maxAreaOfIsland(grid));
    }
}
