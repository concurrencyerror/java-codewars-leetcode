package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution2441 {
    public int findMaxK(int[] nums) {
        Map<Integer, Integer> map = Arrays.stream(nums).distinct().map(Math::abs).boxed().collect(Collectors.toMap(Function.identity(), i -> 1, Integer::sum));
        return map.entrySet().stream().filter(entry -> entry.getValue() == 2).mapToInt(Map.Entry::getKey).max().orElse(-1);
    }
}
