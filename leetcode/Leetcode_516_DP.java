import java.util.Arrays;

public class Leetcode_516_DP {
    //https://leetcode.com/problems/longest-palindromic-subsequence/
}

class Solution6 {
    static int[][] memo2;

    public int longestPalindromeSubseq(String s) {

        memo2 = new int[s.length() + 1][s.length() + 1];
        for (int i = 0; i < memo2[0].length; ++i) Arrays.fill(memo2[i], -1);

        return longestPalin(0, s.length() - 1, s);
    }

    public int longestPalin(int i, int j, String s) {

        if (i == j)
            return 1;

        if (s.charAt(i) == s.charAt(j) && i + 1 == j)
            return 2;

        if (s.charAt(i) == s.charAt(j))
            return memo2[i][j] = 2 + longestPalin(i + 1, j - 1, s);

        if (memo2[i][j] != -1)
            return memo2[i][j];

        return memo2[i][j] = Math.max(longestPalin(i + 1, j, s), longestPalin(i, j - 1, s));
    }

}
