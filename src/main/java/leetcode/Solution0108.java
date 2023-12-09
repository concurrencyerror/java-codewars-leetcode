package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 2022/9/30
 * leetcode
 * horace
 */
public class Solution0108 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> hang = new HashSet<>();
        HashSet<Integer> lie = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] inner = matrix[i];
            for (int in = 0; in < inner.length; in++) {
                if (matrix[i][in] == 0) {
                    hang.add(i);
                    lie.add(in);
                }
            }
        }
        boolean all;
        for (int i = 0; i < matrix.length; i++) {
            all = hang.contains(i);
            int[] inner = matrix[i];
            if (all) {
                Arrays.fill(inner, 0);
            } else {
                for (int in = 0; in < inner.length; in++) {
                    if (lie.contains(in))
                        inner[in] = 0;
                }
            }
        }
    }
}
