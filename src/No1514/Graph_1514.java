package No1514;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/30 6:00 下午
 * Description:
 */
public class Graph_1514 {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        List<double[]>[] graph = new LinkedList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new LinkedList<>();
        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0], to = edges[i][1];
            double weight = succProb[i];
            graph[from].add(new double[]{to, weight});
            graph[to].add(new double[]{from, weight});
        }

        double[] dp = new double[n];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp, -1);
        dp[start] = 1;
        Queue<State> queue = new PriorityQueue<>((a, b) -> {
            return Double.compare(b.dist, a.dist);
        });
        queue.offer(new State(start, 1));
        while (!queue.isEmpty()) {
            State cur = queue.poll();
            int curId = cur.id;
            double curDist = cur.dist;
            if (curId == end)
                return curDist;
            if (curDist < dp[curId])
                continue;
            for (double[] temp : graph[curId]) {
                int tempId = (int)temp[0];
                double tempDist = temp[1] * curDist;
                if (tempDist > dp[tempId]) {
                    dp[tempId] = tempDist;
                    queue.offer(new State(tempId, tempDist));
                }
            }
        }
        return 0.0;
    }
}

class State {
    int id;
    double dist;
    State (int id, double dist) {
        this.dist = dist;
        this.id = id;
    }
}
