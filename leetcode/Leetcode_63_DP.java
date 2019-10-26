import java.util.Arrays;

public class Leetcode_63_DP {
    //https://leetcode.com/problems/unique-paths-ii/
}

class Solution11 {

    static int[][] memo3;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        memo3 = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < memo3.length; ++i) Arrays.fill(memo3[i], -1);

        return path(memo3.length - 1, memo3[0].length - 1, obstacleGrid);
    }

    public int path(int i, int j, int[][] obstacleGrid) {

        if (i < 0 || j < 0)
            return 0;

        if (obstacleGrid[i][j] == 1)
            return 0;

        if (i == 0 && j == 0)
            return 1;

        if (memo3[i][j] != -1)
            return memo3[i][j];

        int x = path(i - 1, j, obstacleGrid);
        int y = path(i, j - 1, obstacleGrid);

        return memo3[i][j] = x + y;

    }
}
