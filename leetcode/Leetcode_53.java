public class Leetcode_53 {
    //https://leetcode.com/problems/maximum-subarray/
}

class Solution15 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        return maxSub( nums);

    }
    // Kadane's algorithm
    public int maxSub( int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
