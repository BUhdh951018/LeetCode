package No167;

/**
 * Name: Donghang He
 * Date: 2022/5/31 3:40 下午
 * Description:
 */
public class DoublePoint_167 {
    public int[] twoSum(int[] numbers, int target) {

        int first = 0, second = numbers.length - 1;

        for (int i = numbers.length - 1; i >= 1; i--) {
            if (numbers[i] <= target) {
                second = i;
                break;
            }
        }
        while (first < second) {
            if (numbers[first] + numbers[second] == target)
                break;
            if (numbers[first] + numbers[second] < target)
                first++;
            else
                second--;
        }

        int[] res = new int[2];
        res[0] = first + 1;
        res[1] = second + 1;
        return res;
    }
}
