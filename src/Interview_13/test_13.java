package Interview_13;

public class test_13 {
    public static void main(String[] args) {
        int m = 2, n = 3, k = 1;
        int ans = new DFS_13().movingCount(m, n, k);
        int res = new BFS_13().movingCount(m, n, k);
        System.out.printf("%d %d", ans, res);
    }
}
