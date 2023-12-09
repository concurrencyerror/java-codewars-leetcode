package leetcode;

import java.util.HashMap;

/**
 * 2022/9/27
 * leetcode
 * horace
 */
public class Solution0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char key = s1.charAt(i);
            if (map.containsKey(key))
                map.replace(key, map.get(key) + 1);
            else map.put(key, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char key = s2.charAt(i);
            if (map.containsKey(key)) {
                Integer index = map.get(key);
                if (index == 1)
                    map.remove(key);
                else map.replace(key, map.get(key) - 1);
            } else return false;
        }
        return true;
    }
}
