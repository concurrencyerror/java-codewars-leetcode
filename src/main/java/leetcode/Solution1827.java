package leetcode;

public class Solution1827 {
    public int minOperations(int[] nums) {
        int result = 0;
        if (nums.length == 1) {
            return result;
        }
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int before = nums[i - 1];
            if (before >= cur) {
                result = result + (before - cur + 1);
                nums[i] = before + 1;
            }
        }
        return result;
    }
}
