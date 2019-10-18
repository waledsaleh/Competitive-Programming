import java.util.Arrays;

public class Leetcode_198_DP {
    //https://leetcode.com/problems/house-robber/
}

class Solution4 {
    static int[] memo;

    public int rob(int[] nums) {
        memo = new int[1000];
        Arrays.fill(memo, -1);
        return maxCost(0, nums);
    }


    public int maxCost(int i, int nums[]) {

        if (i >= nums.length)
            return 0;

        if (memo[i] != -1)
            return memo[i];

        return memo[i] = Math.max(nums[i] + maxCost(i + 2, nums), maxCost(i + 1, nums));
    }

}