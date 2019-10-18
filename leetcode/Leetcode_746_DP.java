import java.util.Arrays;

public class Leetcode_746_DP {

    //https://leetcode.com/problems/min-cost-climbing-stairs/


}

class Solution {
    static int[] memo;

    public int minCostClimbingStairs(int[] cost) {
        memo = new int[1001];
        Arrays.fill(memo, -1);
        return minCost(-1, cost);

    }

    public int minCost(int i, int cost[]) {


        if (i >= cost.length) {
            return 0;
        }

        if (memo[i + 1] != -1)
            return memo[i + 1];

        int val = i < 0 ? 0 : cost[i];
        int first = minCost(i + 1, cost);
        int second = minCost(i + 2, cost);

        return memo[i + 1] = val + Math.min(first, second);
    }
}