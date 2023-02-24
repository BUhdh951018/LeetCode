package No207;

/**
 * Name: Donghang He
 * Date: 2023/2/23 3:25 下午
 * Description:
 */
public class test_207 {
    public static void main(String[] args) {
        int numCourses = 7;
        int[][] prerequisites = {{1, 0}, {1, 2}, {0, 2}, {0, 4}, {0, 5}, {5, 4}, {5, 6}, {3, 5}};
        System.out.println(new DFS_207().canFinish(numCourses, prerequisites));
    }
}
