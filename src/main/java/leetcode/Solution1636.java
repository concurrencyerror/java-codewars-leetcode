package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * 2022/9/19
 * leetcode 按照频率将数组升序排序
 * horace
 */
public class Solution1636 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            if (!map.containsKey(num))
                map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        });
        return map.entrySet().stream().sorted((v1, v2) -> {
                    if (v1.getValue() > v2.getValue())
                        return 1;
                    else if (v1.getValue() < v2.getValue())
                        return -1;
                    else return v2.getKey().compareTo(v1.getKey());
                })
                .flatMapToInt(entry -> IntStream.generate(entry::getKey).limit(entry.getValue())).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Integer.compare(3,2));
    }
}
