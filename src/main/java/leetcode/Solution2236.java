package leetcode;

import common.TreeNode;

public class Solution2236 {
    public boolean checkTree(TreeNode root) {
        return root.left.val + root.right.val == root.val;
    }
}
