package No55;

public class test_55 {
    public static void main(String[] args) {
        int[] temp = {3, 2, 1, 0, 4};
        Boolean ans = new backtrack_55().canJump(temp);
        Boolean res = new dynamic_55().canJump(temp);
        Boolean greed = new greed_55().canJump(temp);
        System.out.println(ans);
        System.out.println(res);
        System.out.println(greed);
        System.out.println(new DP_55().canJump(temp));
    }
}
