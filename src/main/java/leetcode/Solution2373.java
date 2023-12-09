package leetcode;

import java.util.List;

public class Solution2373 {
    public int[][] largestLocal(int[][] grid) {
        int[][] ints = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                ints[i][j] = max(List.of(grid[i][j], grid[i + 1][j], grid[i + 2][j], grid[i][j + 2], grid[i][j + 1], grid[i + 1][j + 2], grid[i + 1][j + 1], grid[i + 2][j + 2], grid[i + 2][j + 1]));
            }
        }
        return ints;
    }

    private int max(List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue).max().orElse(0);
    }
}
