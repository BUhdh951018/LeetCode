package No210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/28 5:45 下午
 * Description:
 */
public class Graph_210 {
    private boolean[] onPath;
    private boolean[] visited;
    private boolean flag = false;
    private final List<Integer> list = new ArrayList<>();
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = build(numCourses, prerequisites);
        onPath = new boolean[numCourses];
        visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++)
            traverse(graph, i);
        if (flag)
            return new int[]{};
        int[] res = new int[numCourses];
        Collections.reverse(list);
        for (int i = 0; i < numCourses; i++)
            res[i] = list.get(i);
        return res;
    }

    private void traverse(List<Integer>[] graph, int index) {
        if (onPath[index])
            flag = true;
        if (visited[index] || flag)
            return;
        onPath[index] = true;
        visited[index] = true;
        for (int temp : graph[index])
            traverse(graph, temp);
        list.add(index);
        onPath[index] = false;
    }

    private List<Integer>[] build(int n, int[][] pre) {
        LinkedList<Integer>[] graph = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int[] p : pre) {
            int from = p[1], to = p[0];
            graph[from].add(to);
        }
        return graph;
    }
}
