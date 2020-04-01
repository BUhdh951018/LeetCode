package No42;

public class test_42 {
    public static void main(String[] args) {
        int[] height = {0 ,1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = new Dynamic_42().trap(height);
        System.out.println(ans);
        int ans1 = new TwoPoint_42().trap(height);
        System.out.println(ans1);
    }
}
