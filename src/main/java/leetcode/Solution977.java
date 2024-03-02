package leetcode;

import java.util.Arrays;

public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(i -> (int) Math.pow(i, 2))
                .sorted().toArray();
    }
}
