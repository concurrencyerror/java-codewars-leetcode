package leetcode;

import java.util.HashMap;

public class Solution2399 {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = String.valueOf(s.charAt(i));
            if (map.containsKey(key)) {
                Integer index = map.get(key);
                map.put(key, i - index - 1);
            } else {
                map.put(key, i);
            }
        }
        for (int i = 0; i < distance.length; i++) {
            String key = String.valueOf((char) ('a' + i));
            if (!s.contains(key)) {
                continue;
            }
            Integer index = map.get(key);
            if (index != distance[i]) {
                return false;
            }
        }
        return true;
    }
}
