package leetcode;

import common.TreeNode;

/**
 * 1022. 从根到叶的二进制数之和
 */
public class SumRootToLeaf1022 {

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int cur) {
        int ans = 0, ncur = (cur << 1) + root.val;
        if (root.left != null) ans += dfs(root.left, ncur);
        if (root.right != null) ans += dfs(root.right, ncur);
        return root.left == null && root.right == null ? ncur : ans;
    }
}
