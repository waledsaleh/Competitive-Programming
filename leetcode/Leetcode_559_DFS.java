import java.util.List;

public class Leetcode_559_DFS {
    //https://leetcode.com/problems/maximum-depth-of-n-ary-tree
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution19 {
    public int maxDepth(Node root) {
        if(root  == null)return 0;
        int max = 1;
        for(Node n : root.children){
            max = Math.max(max,1+maxDepth(n));
        }
        return max;
    }
}