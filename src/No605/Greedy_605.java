package No605;

/**
 * Name: Donghang He
 * Date: 2022/4/24 4:23 下午
 * Description:
 */
public class Greedy_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (len == 0)
            return false;
        if (len == 1 && flowerbed[0] == 0 && n == 1 || n == 0)
            return true;

        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1)
                continue;
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == len - 1 ? 0 : flowerbed[i + 1];
            if (pre == 0 && next == 0) {
                n--;
                flowerbed[i] = 1;
            }

        }
        if (n == 0)
            flag = true;
        return flag;
    }
}
