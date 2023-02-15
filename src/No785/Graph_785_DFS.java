package No785;

/**
 * Name: Donghang He
 * Date: 2023/2/14 2:50 下午
 * Description:
 */
public class Graph_785_DFS {
    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (visited[i] == 0 && !dfs(graph, i, 1, visited)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int[][] graph, int v, int color, int[] visited) {
        if (visited[v] != 0) {
            return visited[v] == color;
        }

        visited[v] = color;
        for (int w : graph[v]) {
            if (!dfs(graph, w, -color, visited)) {
                return false;
            }
        }

        return true;
    }
}
