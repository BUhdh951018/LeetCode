package No785;

/**
 * Name: Donghang He
 * Date: 2023/2/14 2:50 下午
 * Description:
 */
public class Graph_785_DFS {

    private boolean[] visited;
    private boolean[] color;
    private boolean res = true;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        visited = new boolean[n];
        color = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                traverse(graph, i);
        }
        return res;
    }

    private void traverse(int[][] graph, int index) {
        if (!res)
            return;
        visited[index] = true;
        for (int temp : graph[index]) {
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
