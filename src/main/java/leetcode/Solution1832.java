package leetcode;

import java.util.HashMap;

public class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            map.putIfAbsent(c, 1);
        }
        return map.size() == 26;
    }
}
