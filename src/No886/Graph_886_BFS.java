package No886;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/3/31 5:10 下午
 * Description:
 */
public class Graph_886_BFS {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] visited = new int[n + 1];
        List<Integer>[] graph = new List[n + 1];
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();
        for (int[] d : dislikes) {
            graph[d[0]].add(d[1]);
            graph[d[1]].add(d[0]);
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                visited[i] = 1;
                while (!queue.isEmpty()) {
                    int cur = queue.poll();
                    for (int temp : graph[cur]) {
                        if (visited[temp] == visited[cur])
                            return false;
                        if (visited[temp] == 0) {
                            visited[temp] = -visited[cur];
                            queue.offer(temp);
                        }
                    }
                }
            }
        }
        return true;
    }
}
