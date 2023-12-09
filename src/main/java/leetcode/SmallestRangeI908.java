package leetcode;

/**
 * 2022/4/30
 * leetcode 908. 最小差值 I
 * horace
 */
public class SmallestRangeI908 {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
