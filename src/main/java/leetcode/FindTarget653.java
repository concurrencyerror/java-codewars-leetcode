package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022/3/24
 * PACKAGE_NAME
 * horace
 */
public class FindTarget653 {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        for (int i = 0; i < list.size(); i++) {
            int another = k - list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (another == list.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
