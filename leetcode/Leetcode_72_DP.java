import java.util.Arrays;

public class Leetcode_72_DP {
    //https://leetcode.com/problems/edit-distance/
}

class Solution16 {
    static int[][] memo2;

    public int minDistance(String word1, String word2) {
        memo2 = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < memo2.length; ++i) Arrays.fill(memo2[i], -1);

        return editDistance(word1.length(), word2.length(), word1, word2);
    }

    public int editDistance(int i, int j, String w1, String w2) {
        if (i == 0)
            return j;

        if (j == 0)
            return i;

        if (w1.charAt(i - 1) == w2.charAt(j - 1))
            return memo2[i - 1][j - 1] = editDistance(i - 1, j - 1, w1, w2);

        if (memo2[i - 1][j - 1] != -1)
            return memo2[i - 1][j - 1];

        return memo2[i - 1][j - 1] = 1 + Math.min(editDistance(i, j - 1, w1, w2), Math.min(editDistance(i - 1, j, w1, w2), editDistance(i - 1, j - 1, w1, w2)));
    }


}