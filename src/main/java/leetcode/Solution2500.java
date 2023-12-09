package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Solution2500 {
    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for (int[] ints : grid) {
            Arrays.sort(ints);
        }
        for (int i = 0; i < grid[0].length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int[] ints : grid) {
                set.add(ints[i]);
            }
            result += set.stream().mapToInt(n -> n).max().getAsInt();
        }
        return result;
    }
}
