import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class CSES_GridPaths {
    static BigInteger[][] vis;

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[][] grid = new char[n][n];

        vis = new BigInteger[n][n];

        for (int i = 0; i < n; ++i) Arrays.fill(vis[i], BigInteger.valueOf(-1));

        for (int i = 0; i < n; ++i) {
            String line = sc.next();
            for (int j = 0; j < n; ++j) {
                grid[i][j] = line.charAt(j);
            }
        }

        //Another Solution

        long[][] dp = new long[n ][n ];
        dp[0][0] = 1;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == '.') {
                    if (i > 0)
                        dp[i][j] += dp[i - 1][j] % 1000000007;

                    if (j > 0)
                        dp[i][j] += dp[i][j - 1] % 1000000007;

                } else
                    dp[i][j] = 0;
            }
        }

        System.out.println(dp[n - 1][n - 1]);
//        System.out.println(getPaths(grid, 0, 0).mod(BigInteger.valueOf(1000000007)));
    }

    static BigInteger getPaths(char[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length)
            return BigInteger.ZERO;

        if (grid[i][j] == '*')
            return BigInteger.ZERO;

        if (i == grid.length - 1 && j == grid[0].length - 1 && grid[i][j] == '.')
            return BigInteger.ONE;

        if (vis[i][j].compareTo(BigInteger.valueOf(-1)) != 0)
            return vis[i][j];

        return vis[i][j] = getPaths(grid, i + 1, j).add(getPaths(grid, i, j + 1));
    }
}
