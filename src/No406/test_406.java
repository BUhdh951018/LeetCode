package No406;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/22 4:10 下午
 * Description:
 */
public class test_406 {
    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(Arrays.deepToString(new Greedy_406_1().reconstructQueue(people)));
    }
}
