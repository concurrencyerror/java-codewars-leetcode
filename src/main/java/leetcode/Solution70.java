package leetcode;

public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1)
            return n;
        int[] ints = new int[n + 1];
        ints[1] = 1;
        ints[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }
}
