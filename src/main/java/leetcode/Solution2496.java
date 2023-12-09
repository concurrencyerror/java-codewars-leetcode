package leetcode;

import java.util.Arrays;

public class Solution2496 {
    public int maximumValue(String[] strs) {
        return Arrays.stream(strs).mapToInt(s -> {
            if (s.matches(".*[a-zA-Z].*")) {
                return s.length();
            }
            return Integer.parseInt(s);
        }).max().orElse(0);
    }
}
