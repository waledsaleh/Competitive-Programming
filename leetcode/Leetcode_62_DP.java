import java.util.Arrays;

public class Leetcode_62_DP {
    //https://leetcode.com/problems/unique-paths/
}

class Solution10 {
    static int[][] memo3;

    public int uniquePaths(int m, int n) {
        memo3 = new int[n][m];
        for (int i = 0; i < memo3.length; ++i) Arrays.fill(memo3[i], -1);

        return path(n - 1, m - 1, m, n);
    }

    public int path(int i, int j, int m, int n) {

        if (i == 0 && j == 0)
            return 1;

        if (i < 0 || j < 0)
            return 0;

        if (memo3[i][j] != -1)
            return memo3[i][j];

        int x = path(i - 1, j, m, n);
        int y = path(i, j - 1, m, n);

        return memo3[i][j] = x + y;

    }
}