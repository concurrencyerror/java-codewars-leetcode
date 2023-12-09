package leetcode;

import java.util.Arrays;
import java.util.List;

public class Solution2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int result = 0;
        for (int num : nums) {
            int next = num + diff;
            int far = next + diff;
            if (list.contains(next) && list.contains(far)) {
                result++;
            }
        }
        return result;
    }
}
