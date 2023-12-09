package leetcode;

public class Solution2562 {
    public static long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int length = nums.length / 2;
        if (nums.length % 2 != 0) length += 1;
        for (int i = 0, j = nums.length - 1; i < length; i++, j--) {
            if (i == j) {
                result += nums[i];
                return result;
            }
            String tmp = nums[i] + String.valueOf(nums[j]);
            result += Integer.parseInt(tmp);
        }
        return result;
    }
}
