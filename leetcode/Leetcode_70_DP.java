import java.util.Arrays;

public class Leetcode_70_DP {
    //https://leetcode.com/problems/climbing-stairs/
}

class Solution3 {
    static int[] memo;

    public int climbStairs(int n) {
        memo = new int[1000];
        Arrays.fill(memo, -1);
        return solution2(n + 1);

    }

    public int solution2(int n) {

        if (n == 1)
            return 1;

        if (n <= 0)
            return 0;

        if (memo[n] != -1)
            return memo[n];

        return memo[n] = solution2(n - 1) + solution2(n - 2);
    }
}