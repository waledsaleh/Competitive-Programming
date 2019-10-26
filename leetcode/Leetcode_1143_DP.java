import java.util.Arrays;

public class Leetcode_1143_DP {
    //https://leetcode.com/problems/longest-common-subsequence/
}
class Solution13 {
    static int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()+1][text2.length()+1];
        for(int i =0; i <memo.length;++i) Arrays.fill(memo[i],-1);

        return longestSub(0,0,text1,text2);
    }

    public int longestSub(int i, int j, String text1,String text2){

        if(i >= text1.length() || j >= text2.length())
            return 0;

        if(text1.charAt(i) == text2.charAt(j))
            return memo[i][j]=1+longestSub(i+1,j+1,text1,text2);
        if(memo[i][j] != -1)
            return memo[i][j];

        int x = longestSub(i+1,j,text1,text2);
        int y = longestSub(i,j+1,text1,text2);

        return memo[i][j]=Math.max(x,y);


    }
}