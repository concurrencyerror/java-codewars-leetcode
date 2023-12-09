package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Solution2341 {
    public int[] numberOfPairs(int[] nums) {
        int[] result = new int[2];
        if (nums.length < 2) {
            result[1] = 1;
            return result;
        }
        Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));
        AtomicInteger dou = new AtomicInteger(0);
        AtomicInteger dan = new AtomicInteger(0);
        map.values().forEach(i->{
            dou.addAndGet(i / 2);
            dan.addAndGet(i % 2);
        });
        result[0] = dou.get();
        result[1] = dan.get();
        return result;
    }
}
