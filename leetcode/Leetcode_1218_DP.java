import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1218_DP {
    //https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/
}

class Solution18 {
    public int longestSubsequence(int[] arr, int difference) {
        return maxSubsequence(arr, difference);
    }

    public int maxSubsequence(int[] arr, int diff) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            map.put(arr[i], map.containsKey(arr[i] - diff) ? map.get(arr[i] - diff) + 1 : 1);
            max = Math.max(max, map.get(arr[i]));
        }

        return max;
    }

    //Time limit exceeded
    static int maxSubsequence1(int[] arr, int diff) {
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] - arr[i] == diff) {
                    dp[j] = dp[i] + 1;
                }
                max = Math.max(dp[j], max);

            }

        }
        return max;
    }
}