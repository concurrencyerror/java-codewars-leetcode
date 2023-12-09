package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums) {
            if (deque.isEmpty()) {
                deque.add(num);
            } else {
                if (num - deque.getLast() == 1) {
                    deque.add(num);
                } else {
                    if (deque.size() == 1) {
                        result.add(String.valueOf(deque.getFirst()));
                    } else {
                        result.add(deque.getFirst() + "->" + deque.getLast());
                    }
                    deque.clear();
                    deque.add(num);
                }
            }
        }
        if (!deque.isEmpty()) {
            if (deque.size() == 1) {
                result.add(String.valueOf(deque.getFirst()));
            } else {
                result.add(deque.getFirst() + "->" + deque.getLast());
            }
        }
        return result;
    }
}
