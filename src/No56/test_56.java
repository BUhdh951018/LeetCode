package No56;

import java.util.*;

public class test_56 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {7,8},{5,9},{4,6}
        };

        int[][] ans = new sort_56().merge(matrix);
        for(int i = 0; i < ans.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


    }
}
