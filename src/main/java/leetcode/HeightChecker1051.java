package leetcode;

import java.util.Arrays;

/**
 * 2022/6/14
 * leetcode
 * horace
 */
public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] copyOf = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for (int i = 0; i < copyOf.length; i++) {
            if (copyOf[i] != heights[i]) {
                result++;
            }
        }
        return result;
    }
}
