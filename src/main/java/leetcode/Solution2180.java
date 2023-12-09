package leetcode;

import java.util.stream.IntStream;

public class Solution2180 {
    public int countEven(int num) {
        return Math.toIntExact(IntStream.rangeClosed(1, num).map(this::sum).filter(i -> i % 2 == 0).count());
    }

    private int sum(int num) {
        int result = 0;
        while (num != 0) {
            int item = num % 10;
            result += item;
            num = num / 10;
        }
        return result;
    }
}
