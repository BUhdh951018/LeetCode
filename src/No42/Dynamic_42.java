package No42;

public class Dynamic_42 {
    public int trap(int[] height) {
        int ans = 0;
        int len = height.length;

        int[] left_max = new int[len];
        int[] right_max = new int[len];

        left_max[0] = height[0];
        for(int i = 1; i < len; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        right_max[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        for (int i = 1; i < len - 1; i++) {
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return ans;
    }
}
