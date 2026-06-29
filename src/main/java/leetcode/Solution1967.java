package leetcode;

import java.util.Arrays;

public class Solution1967 {
    public int numOfStrings(String[] patterns, String word) {
        return Math.toIntExact(Arrays.stream(patterns).filter(word::contains).count());
    }
}
