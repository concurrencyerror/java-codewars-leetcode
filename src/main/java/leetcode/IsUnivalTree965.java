package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IsUnivalTree965 {
    public boolean isUnivalTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(list, root);
        for (int i = 0; i < (list.size() - 1); i++) {
            if (!list.get(i).equals(list.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    private void dfs(List<Integer> list, TreeNode node) {
        if (node == null)
            return;
        list.add(node.val);
        dfs(list, node.left);
        dfs(list, node.right);
    }
}
