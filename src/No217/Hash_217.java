package No217;

import java.util.HashSet;

/**
 * Name: Donghang He
 * Date: 2022/3/20 8:56 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Hash_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}
