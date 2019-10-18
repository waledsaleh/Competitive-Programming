public class Leetcode_338 {
    //https://leetcode.com/problems/counting-bits/
}

class Solution5 {
    public int[] countBits(int num) {
        int res[] = new int[num + 1];
        for (int i = 0; i < res.length; ++i)
            res[i] = Integer.bitCount(i);

        return res;
    }
}