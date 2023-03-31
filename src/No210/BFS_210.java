package No210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/3/29 4:33 下午
 * Description:
 */
public class BFS_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            list.add((new ArrayList<>()));
        }

        int[] direct = new int[numCourses];
        for (int[] course : prerequisites) {
            list.get(course[1]).add(course[0]);
            direct[course[0]]++;
        }
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < direct.length; i++) {
            if (direct[i] == 0)
                queue.add(i);
        }
        int[] res = new int[numCourses];

        while (!queue.isEmpty()) {
            int course = queue.poll();
            res[count] = course;
            count++;
            for (int next : list.get(course)) {
                --direct[next];
                if (direct[next] == 0)
                    queue.add(next);
            }
        }
        if (count != numCourses)
            return new int[]{};

        return res;
    }
}
