package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = Arrays.stream(nums).filter(i -> i % 2 == 0).boxed().collect(Collectors.toMap(Function.identity(), i -> 1, Integer::sum));
        if (map.isEmpty()) {
            return -1;
        }
        return map.entrySet().stream().sorted((v1, v2) -> {
            if (Objects.equals(v1.getValue(), v2.getValue())) {
                return Integer.compare(v1.getKey(), v2.getKey());
            } else {
                return -Integer.compare(v1.getValue(), v2.getValue());
            }
        }).map(Map.Entry::getKey).findFirst().orElse(-1);
    }
}
