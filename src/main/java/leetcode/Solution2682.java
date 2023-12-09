package leetcode;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Solution2682 {
    public int[] circularGameLosers(int n, int k) {
        boolean stop = true;
        int temp = 1;
        int point = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(point);
        while (stop) {
            int cur = temp * k;
            if (cur > n) {
                cur %= n;
            }
            point += cur;
            if (point > n) {
                point %= n;
            }
            stop = set.add(point);
            temp++;
        }
        return IntStream.rangeClosed(1, n).filter(i -> !set.contains(i)).toArray();
    }
}
