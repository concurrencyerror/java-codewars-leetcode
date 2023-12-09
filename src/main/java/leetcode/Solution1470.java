package leetcode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 1470. 重新排列数组
 */
public class Solution1470 {
    /**
     * 老实现，用半stream流实现
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        AtomicInteger j = new AtomicInteger(0);
        IntStream.range(0, n).forEach(i -> {
            result[j.get()] = nums[i];
            result[j.get() + 1] = nums[i + n];
            j.addAndGet(2);
        });
        return result;
    }

    /**
     * 新的实现（用stream流的形式实现）
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle2(int[] nums, int n) {
        return IntStream.range(0, n).flatMap(i -> IntStream.of(nums[i], nums[i + n])).toArray();
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shuffle(test, 3)));
    }
}
