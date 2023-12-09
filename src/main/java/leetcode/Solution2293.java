package leetcode;

public class Solution2293 {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] ints = new int[nums.length / 2];
        for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
            if (j % 2 == 0) {
                ints[j] = Math.min(nums[i], nums[i + 1]);
            } else {
                ints[j] = Math.max(nums[i], nums[i + 1]);
            }
        }
        return minMaxGame(ints);
    }
}
