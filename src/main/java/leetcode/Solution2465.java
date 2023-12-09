package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2465 {
    public int distinctAverages(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        Set<Float> result = IntStream.range(0, sorted.length / 2).mapToObj(i -> (float) (sorted[i] + sorted[nums.length - i - 1]) / 2).collect(Collectors.toSet());
        return result.size();
    }
}
