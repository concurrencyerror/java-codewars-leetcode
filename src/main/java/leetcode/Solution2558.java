package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2558 {
    public long pickGifts(int[] gifts, int k) {
        List<Integer> list = Arrays.stream(gifts).boxed().collect(Collectors.toList());
        for (int i = 0; i < k; i++) {
            int max = list.stream().mapToInt(g -> g).max().orElse(0);
            list.remove(Integer.valueOf(max));
            int sqrt = (int) Math.sqrt(max);
            list.add(sqrt);
        }
        return list.stream().mapToLong(g -> g).sum();
    }
}
