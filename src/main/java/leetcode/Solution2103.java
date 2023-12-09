package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution2103 {
    public int countPoints(String rings) {
        HashMap<String, Set<String>> map = new HashMap<>();
        for (int i = 0; i < rings.length(); i += 2) {
            String color = String.valueOf(rings.charAt(i));
            String num = String.valueOf(rings.charAt(i + 1));
            if (map.containsKey(num)) {
                map.get(num).add(color);
            } else {
                HashSet<String> set = new HashSet<>();
                set.add(color);
                map.put(num, set);
            }
        }
        return (int) map.entrySet().stream().filter(en -> en.getValue().size() == 3).count();
    }
}
