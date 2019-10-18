import java.util.Arrays;
import java.util.List;

public class HackerRank_Coin_Change {

    //https://www.hackerrank.com/challenges/coin-change/problem

    static class Result {

        static long[][] memo;

        public static long getWays(int n, List<Long> c) {
            memo = new long[251][251];
            for (int i = 0; i < memo[0].length; ++i)
                Arrays.fill(memo[i], -1);
            return countWays(0, n, c);
        }

        static long countWays(int i, long n, List<Long> c) {

            if (i >= c.size() || n < 0)
                return 0;

            if (n == 0)
                return 1;

            if (memo[i][(int) n] != -1)
                return memo[i][(int) n];

            return memo[i][(int) n] = countWays(i, n - c.get(i), c) + countWays(i + 1, n, c);
        }
    }

}
