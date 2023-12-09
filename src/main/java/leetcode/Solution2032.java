package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> map = IntStream.concat(IntStream.concat(Arrays.stream(nums1).distinct(), Arrays.stream(nums2).distinct()), Arrays.stream(nums3).distinct())
                .boxed().collect(Collectors.toMap((v1) -> v1, (v1) -> 1, Integer::sum));
        return map.entrySet().stream().filter(entry -> entry.getValue() >= 2).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
