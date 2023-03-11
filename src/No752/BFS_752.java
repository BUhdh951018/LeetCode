package No752;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/8 4:19 下午
 * Description:
 */
public class BFS_752 {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        Set<String> visited = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        int step = 0;
        set1.add("0000");
        set2.add(target);

        while (!set1.isEmpty() && !set2.isEmpty()) {
            Set<String> temp = new HashSet<>();
//            if (set1.size() > set2.size()) {
//                temp = set1;
//                set1 = set2;
//                set2 = temp;
//            }

            for (String cur : set1) {
                if (dead.contains(cur))
                    continue;

                if (set2.contains(cur))
                    return step;

                visited.add(cur);
                for (int j = 0; j < 4; j++) {
                    String up = turn(cur, j, 0);
                    if (!visited.contains(up)) {
                        temp.add(up);
                    }

                    String down = turn(cur, j, 1);
                    if (!visited.contains(down)) {
                        temp.add(down);
                    }
                }
            }
            step++;
            set1 = set2;
            set2 = temp;
        }

        return -1;
    }

    private String turn(String cur, int i, int direct) {
        char[] c = cur.toCharArray();
        if (direct == 0) {
            if (c[i] == '9')
                c[i] = '0';
            else
                c[i] += 1;
        } else {
            if (c[i] == '0')
                c[i] = '9';
            else
                c[i] -= 1;
        }

        return new String(c);
    }
}
