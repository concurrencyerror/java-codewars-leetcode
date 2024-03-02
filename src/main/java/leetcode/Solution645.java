package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = Arrays.stream(nums).boxed()
                .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));
        int all = (1 + nums.length) * nums.length / 2;
        int arraySum = Arrays.stream(nums).sum();
        Map.Entry<Integer, Integer> entry = map.entrySet().stream().filter(en -> en.getValue().equals(2)).findAny().orElseThrow();
        int result = all > arraySum ? entry.getKey() + Math.abs(all - arraySum) : entry.getKey() - Math.abs(all - arraySum);
        return new int[]{entry.getKey(), result};
    }
}
