package No797;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/28 5:08 下午
 * Description:
 */
public class Graph_797 {
    private final List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        traverse(new LinkedList<>() ,graph, 0);
        return res;
    }

    private void traverse(LinkedList<Integer> cur, int[][] graph, int index) {
        cur.add(index);
        if (index == graph.length - 1)
            res.add(new ArrayList<>(cur));

        for (int temp : graph[index]) {
            traverse(cur, graph, temp);
        }

        cur.removeLast();
    }
}
