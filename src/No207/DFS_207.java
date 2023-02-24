package No207;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/2/23 3:19 下午
 * Description:
 */
public class DFS_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            list.add((new ArrayList<>()));
        }

        int[] direct = new int[numCourses];
        for (int[] course : prerequisites) {
            list.get(course[0]).add(course[1]);
            direct[course[1]]++;
        }
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < direct.length; i++) {
            if (direct[i] == 0)
                queue.add(i);
        }

        while (!queue.isEmpty()) {
            count++;
            int course = queue.poll();
            for (int next : list.get(course)) {
                --direct[next];
                if (direct[next] == 0)
                    queue.add(next);
            }
        }

        return count == numCourses;
    }
}
