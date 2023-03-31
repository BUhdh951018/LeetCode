package No886;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/3/29 5:29 下午
 * Description:
 */
public class Graph_886 {
    private boolean[] color;
    private boolean[] visited;
    private boolean res = true;
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        visited = new boolean[n];
        color = new boolean[n];
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] dis : dislikes) {
            int first = dis[0] - 1, second = dis[1] - 1;
            graph.get(first).add(second);
            graph.get(second).add(first);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                traverse(graph, i);
        }
        return res;
    }

    private void traverse(List<List<Integer>> graph, int index) {
        if (!res)
            return;
        visited[index] = true;

        for (int temp : graph.get(index)) {
            if (!visited[temp]) {
                color[temp] = !color[index];
                traverse(graph, temp);
            } else {
                if (color[temp] == color[index]) {
                    res = false;
                    return;
                }
            }
        }
    }
}
