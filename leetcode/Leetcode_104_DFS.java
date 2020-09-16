public class Leetcode_104_DFS {
    //https://leetcode.com/problems/maximum-depth-of-binary-tree/
}


class Solution20 {
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right == null)return 1;

        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);

        return Math.max(left,right);
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */