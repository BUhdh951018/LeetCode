package No207;

import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/28 5:19 下午
 * Description:
 */
public class Graph_207 {
    private boolean[] onPath;
    private boolean[] visited;
    private boolean res = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = build(numCourses, prerequisites);
        onPath = new boolean[numCourses];
        visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++)
            traverse(graph, i);

        return !res;
    }

    private void traverse(List<Integer>[] graph, int index) {
        if (onPath[index])
            res = true;
        if (visited[index] || res)
            return;
        visited[index] = true;
        onPath[index] = true;
        for (int temp : graph[index]) {
            traverse(graph, temp);
        }
        onPath[index] = false;
    }

    private List<Integer>[] build(int numCourses, int[][] prerequisites) {
        LinkedList<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new LinkedList<>();
        for (int[] pre : prerequisites) {
            int start = pre[1], end = pre[0];
            graph[start].add(end);
        }
        return graph;
    }
}
