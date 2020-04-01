package No55;

public class test_55 {
    public static void main(String[] args) {
        int[] temp = {2, 3, 1, 1, 4};
        Boolean ans = new backtrack_55().canJump(temp);
        Boolean res = new dynamic_55().canJump(temp);
        Boolean greed = new greed_55().canJump(temp);
        System.out.println(ans);
        System.out.println(res);
        System.out.println(greed);
    }
}
