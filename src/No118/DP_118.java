package No118;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/4/9 5:00 下午
 * Description:
 */
public class DP_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int num;
                if (j == 0 || j == i)
                    num = 1;
                else
                    num = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                list.add(num);
            }

            res.add(list);
        }

        return res;
    }
}
