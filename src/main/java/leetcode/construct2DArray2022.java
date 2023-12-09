package leetcode;

/**
 * 2022/1/1
 * leetcode
 * horace
 */
public class construct2DArray2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != (m * n)) {
            return new int[0][0];
        } else {
            int[][] result = new int[m][n];
            int start = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++, start++) {
                    result[i][j] = original[start];
                }
            }
            return result;
        }
    }
}
