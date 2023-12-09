package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * 2022/1/7
 * leetcode
 * horace
 */
public class MaxDepth1614 {
    public int maxDepth(String s) {
        Stack<Character> characters = new Stack<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                characters.push('(');
                integers.add(characters.size());
            } else if (s.charAt(i) == ')') {
                characters.pop();
                integers.add(characters.size());
            }
        }
        if (integers.size() == 0) {
            return 0;
        }
        return Collections.max(integers);
    }
}
