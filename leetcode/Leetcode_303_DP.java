public class Leetcode_303_DP {
    //https://leetcode.com/problems/range-sum-query-immutable/
}

class NumArray {
    static int arr2[];

    public NumArray(int[] nums) {
        arr2= new int[nums.length+1];
        for (int i = 1; i <= nums.length; ++i) arr2[i] = arr2[i-1] + nums[i - 1];

    }

    public int sumRange(int i, int j) {
        return arr2[j+1] - arr2[i];
    }
}

