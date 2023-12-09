package leetcode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        AtomicInteger result = new AtomicInteger();
        Arrays.sort(students);
        Arrays.sort(seats);
        IntStream.range(0, seats.length).forEach(i -> result.set(result.get() + Math.abs(seats[i] - students[i])));
        return result.get();
    }
}
