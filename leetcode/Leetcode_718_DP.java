public class Leetcode_718_DP {
    //https://leetcode.com/problems/maximum-length-of-repeated-subarray/
}

class Solution7 {
    public int findLength(int[] A, int[] B) {
        int dp[][] = new int[A.length + 1][B.length + 1];

        int max = -1;
        for (int i = 1; i <= A.length; ++i) {
            for (int j = 1; j <= B.length; ++j) {
                if (A[i - 1] == B[j - 1])
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 0;

                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}