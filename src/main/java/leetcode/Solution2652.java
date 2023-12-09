package leetcode;

import java.util.stream.IntStream;

public class Solution2652 {
    public int sumOfMultiples(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0).sum();
    }
}

