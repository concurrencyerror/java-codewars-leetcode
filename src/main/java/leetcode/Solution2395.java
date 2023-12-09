package leetcode;

import java.util.stream.IntStream;

public class Solution2395 {
    public boolean findSubarrays(int[] nums) {
        long count = IntStream.range(1, nums.length).map(i -> nums[i - 1] + nums[i]).distinct().count();
        return count != nums.length - 1;
    }
}
