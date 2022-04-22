package No406;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Name: Donghang He
 * Date: 2022/4/22 3:58 下午
 * Description:
 */
public class Greedy_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, Comparator.comparingInt(o -> o[1]));
        int len = people.length;
        for (int i = 1; i < len; i++) {
            int m = people[i][1];
            int temp = 0;
            int old = i;
            for (int j = i - 1; j >= 0; j--) {
                if (people[old][0] <= people[j][0]) {
                    temp++;
                    if (temp > m) {
                        swap(people, i - temp + m, old);
                        old = i - temp + m;
                    }
                }
            }
        }

        return people;
    }

    private void swap(int[][] people, int i, int j) {
        int[] temp = people[i];
        people[i] = people[j];
        people[j] = temp;
    }
}
