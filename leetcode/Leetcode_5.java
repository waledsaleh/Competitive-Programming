public class Leetcode_5 {
    //https://leetcode.com/problems/longest-palindromic-substring/
}

class Solution17 {
    public String longestPalindrome(String s) {
        return lgstSubString(s);

    }

    public  String lgstSubString(String s) {
        String res = "";
        StringBuilder concatenate;
        for (int i = 0; i < s.length(); ++i) {
            concatenate = new StringBuilder();
            for (int j = i; j < s.length(); ++j) {
                concatenate.append(s.charAt(j));
                if (isPalindrome(concatenate.toString()) && concatenate.length() > res.length())
                    res = concatenate.toString();
            }
        }

        return res;
    }
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }

        return i > j;
    }
}