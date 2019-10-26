import java.util.Arrays;

public class Leetcode_64_DP {
    //https://leetcode.com/problems/minimum-path-sum/
}

class Solution9 {
    static int[][] memo2;

    public int minPathSum(int[][] grid) {
        memo2 = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; ++i) Arrays.fill(memo2[i], -1);

        return minPath(grid.length - 1, grid[0].length - 1, grid);
    }

    public int minPath(int i, int j, int[][] grid) {

        if (i == 0 && j == 0)
            return grid[i][j];

        if (i < 0 || j < 0)
            return Integer.MAX_VALUE;

        if (memo2[i][j] != -1)
            return memo2[i][j];

        return memo2[i][j] = grid[i][j] + Math.min(minPath(i - 1, j, grid), minPath(i, j - 1, grid));

    }
}