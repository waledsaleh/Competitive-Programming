import java.util.Arrays;

public class Leetcode_712_DP {
    //https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/
}


class Solution12 {
    static int[][] memo2;

    public int minimumDeleteSum(String s1, String s2) {
        memo2 = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);


        return minDelete(0, 0, s1, s2);

    }

    public int sumString(String string, int indx) {
        int sum = 0;

        for (int i = indx; i < string.length(); i++) {
            sum = sum + (int) string.charAt(i);
        }
        return sum;
    }

    public int minDelete(int i, int j, String s1, String s2) {
        if (i == s1.length())
            return sumString(s2, j);

        if (j == s2.length())
            return sumString(s1, i);

        if (s1.charAt(i) == s2.charAt(j))
            return memo2[i][j]=minDelete(i + 1, j + 1, s1, s2);

        if (memo2[i][j] != -1)
            return memo2[i][j];

        int x = s1.charAt(i) + minDelete(i + 1, j, s1, s2);
        int y = s2.charAt(j) + minDelete(i, j + 1, s1, s2);

        return memo2[i][j] = Math.min(x, y);
    }

}