package Interview_13;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visit = new boolean[m][n];

        int ans = 0;
        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(new int[] {0, 0, 0, 0});

        while (queue.size() > 0) {
           int[] temp = queue.poll();
           int i = temp[0], j = temp[1], si = temp[2], sj = temp[3];

           if (i < 0 || i >= m || j < 0 || j >= n || si + sj > k || visit[i][j])
               continue;

           visit[i][j] = true;
           ans++;
           queue.add(new int[] {i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj});
           queue.add(new int[] {i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8});
        }

        return ans;
    }
}
