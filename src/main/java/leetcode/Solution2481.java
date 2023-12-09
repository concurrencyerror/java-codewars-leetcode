package leetcode;

public class Solution2481 {
    public int numberOfCuts(int n) {
        if (n == 1 || n % 2 == 0) {
            return n / 2;
        }
        return n;
    }
}