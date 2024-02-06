package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution387 {
    public int firstUniqChar(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));
            if (!map.containsKey(value)) {
                map.put(value, i);
            } else map.put(value, -1);
        }
        return map.values().stream().mapToInt(i -> i).filter(i -> i != -1).min().orElse(-1);
    }
}
