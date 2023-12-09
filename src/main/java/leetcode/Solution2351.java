package leetcode;

import java.util.HashSet;

public class Solution2351 {
    public char repeatedCharacter(String s) {
        char[] chars = s.toCharArray();
        char result = 0;
        HashSet<Character> set = new HashSet<>();
        for (char aChar : chars) {
            if (set.contains(aChar)) {
                result = aChar;
                break;
            } else set.add(aChar);
        }
        return result;
    }
}
