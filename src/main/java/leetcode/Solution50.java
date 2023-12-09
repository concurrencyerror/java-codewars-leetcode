package leetcode;

import java.util.Arrays;

public class Solution50 {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] op : operations) {
            int v = gem[op[0]] / 2;
            gem[op[0]] -= v;
            gem[op[1]] += v;
        }
        return Arrays.stream(gem).max().orElse(0) - Arrays.stream(gem).min().orElse(0);
    }
}
