package leetcode;

import java.util.Arrays;

/**
 * 2022/5/7
 * leetcode 169. 多数元素
 * horace
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
