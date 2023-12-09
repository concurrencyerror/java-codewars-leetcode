package common;

import java.util.List;

/**
 * @author: horace
 * @date: 2021/11/21
 * @description: 描述
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
