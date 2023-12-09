package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1441 {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int cur = 0;
        for (int i = 1; i <= n; i++) {
            list.add("Push");
            if (target[cur] != i) {
                list.add("Pop");
            } else {
                cur++;
                if (cur == target.length) {
                    break;
                }
            }

        }
        return list;
    }
}
