package leetcode;

public class Solution2485 {
    public int pivotInteger(int n) {
        double sqrt = Math.sqrt((Math.pow(n, 2) + n) / 2);
        return Math.round(sqrt) == sqrt ? (int) sqrt : -1;
    }
}
