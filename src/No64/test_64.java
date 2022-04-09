package No64;

public class test_64 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        int ans = new DP_64().minPathSum(grid);
        System.out.println(ans);
    }
}
