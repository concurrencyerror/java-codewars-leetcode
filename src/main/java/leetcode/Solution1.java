package leetcode;

import java.util.stream.Stream;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return Stream.of(i, j).mapToInt(n -> n).toArray();
            }
        }
        return null;
    }
}
