package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1021. 删除最外层的括号
 */
public class RemoveOuterParentheses1021 {
    public String removeOuterParentheses(String s) {
        Deque<Character> temp = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (!temp.isEmpty()) {
                    builder.append(c);
                }
                temp.push(c);
            } else {
                if (temp.size() > 1) {
                    builder.append(c);
                }
                temp.pop();
            }
        }
        return builder.toString();
    }
}
