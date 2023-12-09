package leetcode;

public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            int second = mat.length - 1 - i;
            if (second == i) {
                result += mat[second][i];
            } else {
                result += mat[i][i];
                result += mat[second][i];
            }
        }
        return result;
    }
}
