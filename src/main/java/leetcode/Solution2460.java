package leetcode;

import java.util.Arrays;

public class Solution2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int[] array = Arrays.stream(nums).filter(i -> i != 0).toArray();
        return Arrays.copyOf(array, nums.length);
    }
}
