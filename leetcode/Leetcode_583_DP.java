import java.util.Arrays;

public class Leetcode_583_DP {
    //https://leetcode.com/problems/delete-operation-for-two-strings/
}

class Solution14 {
    static int[][] memo2;

    public int minDistance(String word1, String word2) {

        memo2 = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);

        return word1.length() + word2.length() - 2 * distance(word1.length() - 1, word2.length() - 1, word1, word2);

    }

    public int distance(int i, int j, String w1, String w2) {
        if (i < 0 || j < 0)
            return 0;

        if (w1.charAt(i) == w2.charAt(j))
            return memo2[i][j]=1 + distance(i - 1, j - 1, w1, w2);

        if (memo2[i][j] != -1)
            return memo2[i][j];

        int x = distance(i - 1, j, w1, w2);
        int y = distance(i, j - 1, w1, w2);

        return memo2[i][j] = Math.max(x, y);

    }
}
