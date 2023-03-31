package No743;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/30 4:50 下午
 * Description:
 */
public class Graph_743 {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new LinkedList[n + 1];
        for (int i = 1; i <= n; i++)
            graph[i] = new LinkedList<>();
        for (int[] time : times) {
            int from = time[0];
            int to = time[1];
            int weight = time[2];
            graph[from].add(new int[]{to, weight});
        }

        int[] dist = dijkstra(k, graph);

        int res = 0;
        for (int i = 1; i <= dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            res = Math.max(res, dist[i]);
        }

        return res;
    }

    private int[] dijkstra(int start, List<int[]>[] graph) {
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[start] = 0;
        Queue<State> queue = new PriorityQueue<>((a, b) -> {
            return a.distFromStart - b.distFromStart;
        });
        queue.offer(new State(start, 0));
        while (!queue.isEmpty()) {
            State cur = queue.poll();
            int curId = cur.id;
            int curDist = cur.distFromStart;
            if (curDist > dist[curId])
                continue;
            for (int[] temp : graph[curId]) {
                int tempId = temp[0];
                int tempDist = temp[1] + curDist;
                if (dist[tempId] > tempDist) {
                    dist[tempId] = tempDist;
                    queue.offer(new State(tempId, tempDist));
                }
            }
        }

        return dist;
    }
}

class State {
    int id, distFromStart;
    State(int id, int dist) {
        this.id = id;
        this.distFromStart = dist;
    }
}
