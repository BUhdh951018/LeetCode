package No785;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/2/14 1:38 下午
 * Description:
 */
public class Graph_785_BFS {
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] != 0) {
                continue;
            }
            queue.offer(i);
            visited[i] = 1;
            while (!queue.isEmpty()) {
                int v = queue.poll();
                for (int w : graph[v]) {
                    if (visited[w] == visited[v]) {
                        return false;
                    }
                    if (visited[w] == 0) {
                        visited[w] = -visited[v];
                        queue.offer(w);
                    }
                }
            }
        }
        return true;
    }
}
