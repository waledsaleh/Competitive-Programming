public class Leetcode_392 {
    //https://leetcode.com/problems/is-subsequence/
}

class Solution2 {
    public boolean isSubsequence(String s, String t) {
        return solution(0, 0, s, t);

    }

    public boolean solution(int i, int j, String s, String t) {

        if (i == s.length())
            return true;

        if (j >= t.length())
            return false;

        if (s.charAt(i) == t.charAt(j))
            return solution(i + 1, j + 1, s, t);

        return solution(i, j + 1, s, t);
    }
}