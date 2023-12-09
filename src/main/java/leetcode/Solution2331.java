package leetcode;

import leetcode.common.TreeNode;

public class Solution2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 1) return true;
        if (root.val == 3) return evaluateTree(root.left) && evaluateTree(root.right);
        if (root.val == 2) return evaluateTree(root.left) || evaluateTree(root.right);
        return false;
    }
}
