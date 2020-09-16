import java.util.Arrays;
import java.util.Scanner;

public class CSES_MinimizingCoins_DP {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), x = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

        int[] dp = new int[x + 1];
        Arrays.fill(dp, (int)1e9);

        dp[0] = 0;
        for (int i = 1; i <= x; ++i) {
            for (int j = 0; j < n; ++j) {
                int left = i - arr[j];
                if (left >= 0) {
                    dp[i] = Math.min(dp[i], dp[left] + 1);
                }

            }
        }

        System.out.println(dp[x] == (int)1e9 ? -1 : dp[x]);
//        int res = countCoins(arr, x, 0, 0);
//        System.out.println(res == Integer.MAX_VALUE ? -1 : res);

    }

    static int countCoins(int[] arr, int x, int i, int count) {
        if (i >= arr.length || x < 0)
            return Integer.MAX_VALUE;

        if (x == 0)
            return count;

        int left = countCoins(arr, x - arr[i], i, count + 1);
        int right = countCoins(arr, x, i + 1, count);

        return Math.min(left, right);

    }
}
