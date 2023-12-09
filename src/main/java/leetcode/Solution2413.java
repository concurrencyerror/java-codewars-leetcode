package leetcode;

public class Solution2413 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        else return n * 2;
    }
}
