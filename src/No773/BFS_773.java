package No773;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/4/5 6:52 下午
 * Description:
 */
public class BFS_773 {
    public int slidingPuzzle(int[][] board) {
        int m = 2, n = 3;
        StringBuilder sb = new StringBuilder();
        String target = "123450";
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sb.append(board[i][j]);

        String start = sb.toString();
        int[][] dirt = {
                {1, 3},
                {0, 2, 4},
                {1, 5},
                {0, 4},
                {1, 3, 5},
                {2, 4}
        };
        Queue<String> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        queue.offer(start);
        set.add(start);
        int step = 0;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                String cur = queue.poll();
                if (target.equals(cur))
                    return step;
                int index = 0;
                while (cur.charAt(index) != '0')
                    index++;

                for (int adj : dirt[index]) {
                    String temp = swap(cur.toCharArray(), adj, index);
                    if (!set.contains(temp)) {
                        queue.offer(temp);
                        set.add(temp);
                    }
                }
            }
            step++;
        }
        return -1;
    }
    private String swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
}
