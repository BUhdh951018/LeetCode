package No119;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/4/9 5:32 下午
 * Description:
 */
public class DP_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int num;
                if (j == 0 || j == i)
                    num = 1;
                else
                    num = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                list.add(num);
            }
            if (i == rowIndex)
                return list;
            res.add(list);
        }

        return null;
    }
}
