package leetcode;

public class Solution2319 {
    public boolean checkXMatrix(int[][] grid) {
        int num = grid.length;
        for (int i = 0; i < num; i++) {
            if (grid[i][i] == 0 || grid[i][num - 1 - i] == 0) {
                return false;
            }
            for (int j = 0; j < num; j++) {
                if (j == i)
                    continue;
                if (j == (num - 1 - i))
                    continue;
                if (grid[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
