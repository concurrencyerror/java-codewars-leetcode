package leetcode;

import java.util.Arrays;
import java.util.List;

public class Solution2455 {
    public int averageValue(int[] nums) {
        List<Integer> arm = Arrays.stream(nums).filter(i -> i % 3 == 0 && i % 2 == 0).boxed().toList();
        if (arm.size() == 0) {
            return 0;
        }
        return arm.stream().reduce(Integer::sum).orElse(0) / arm.size();
    }
}
