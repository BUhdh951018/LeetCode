package No787;

/**
 * Name: Donghang He
 * Date: 2023/3/27 6:37 下午
 * Description:
 */
public class test {
    public static void main(String[] args) {
        int[][] flights = {{0,1,100}, {1,2,100}, {2,0,100}, {1,3,600}, {2,3,200}};
        System.out.println(new DP_787().findCheapestPrice(4, flights, 0, 3, 1));
    }
}
