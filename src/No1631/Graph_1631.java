package No1631;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/30 5:34 下午
 * Description:
 */
public class Graph_1631 {

    private final int[][] dirt = {{0, 1}, {0, -1}, {1, 0}, {-1,0}};

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] effort = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(effort[i], Integer.MAX_VALUE);
        effort[0][0] = 0;
        Queue<State> queue = new PriorityQueue<>((a, b) -> {
            return a.effortFromStart - b.effortFromStart;
        });
        queue.offer(new State(0, 0, 0));
        while (!queue.isEmpty()) {
            State cur = queue.poll();
            int curX = cur.x;
            int curY = cur.y;
            int curEffort = cur.effortFromStart;
            if (curX == m - 1 && curY == n - 1)
                return curEffort;
            if (curEffort > effort[curX][curY])
                continue;
            for (int[] temp : next(curX, curY, heights)) {
                int tempX = temp[0], tempY = temp[1];
                int tempEffort = Math.max(effort[curX][curY],
                        Math.abs(heights[curX][curY] - heights[tempX][tempY]));
                if (tempEffort < effort[tempX][tempY]) {
                    effort[tempX][tempY] = tempEffort;
                    queue.offer(new State(tempX, tempY, tempEffort));
                }
            }
        }

        return -1;
    }

    private List<int[]> next(int x, int y, int[][] heights) {
        List<int[]> res = new ArrayList<>();
        for (int[] d : dirt) {
            int dX = d[0] + x, dY = d[1] + y;
            if (dX < 0 || dX >= heights.length || dY < 0 || dY >= heights[0].length)
                continue;
            res.add(new int[]{dX, dY});
        }
        return res;
    }
}


class State {
    int x, y;
    int effortFromStart;
    State(int x, int y, int effort) {
        this.x = x;
        this.y = y;
        this.effortFromStart = effort;
    }
}
