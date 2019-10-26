import java.util.Arrays;

public class Leetcode_494_DP {
    //https://leetcode.com/problems/target-sum/
}


class Solution8 {
    static int[][] memo2;

    public int findTargetSumWays(int[] nums, int S) {
        memo2 = new int[nums.length][2001];
        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], Integer.MIN_VALUE);

        return findSumWays(0, 0, nums, S);
    }

    public int findSumWays(int i, int sum, int nums[], int S) {
        if (sum == S && i == nums.length)
            return 1 + findSumWays(i + 1, sum, nums, S);

        if (i >= nums.length)
            return 0;

        if (memo2[i][sum + 1000] != Integer.MIN_VALUE)
            return memo2[i][sum + 1000];


        return memo2[i][sum + 1000] = findSumWays(i + 1, sum + nums[i], nums, S) + findSumWays(i + 1, sum - nums[i], nums, S);

    }
}