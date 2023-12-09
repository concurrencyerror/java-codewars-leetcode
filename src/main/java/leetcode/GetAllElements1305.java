package leetcode;

import common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2022/5/2
 * leetcode 1305. 两棵二叉搜索树中的所有元素
 * horace
 */
public class GetAllElements1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        getNum(root1, result);
        getNum(root2, result);
        Collections.sort(result);
        return result;
    }

    private void getNum(TreeNode node, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        getNum(node.left, list);
        getNum(node.right, list);
    }
}
