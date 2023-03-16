package No380;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/15 5:13 下午
 * Description:
 */
public class RandomizedSet {

    private final List<Integer> nums;
    private final Map<Integer, Integer> map;

    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        map.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;

        int index = map.get(val);
        map.put(nums.get(nums.size() - 1), index);
        Collections.swap(nums, index, nums.size() - 1);
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get((int) (Math.random() * nums.size()));
    }
}
