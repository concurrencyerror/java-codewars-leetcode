package leetcode;

public class Solution2582 {
    public int passThePillow(int n, int time) {
        int sum = (n - 1) * 2;
        int step = time % sum;
        if (step < n) {
            return step + 1;
        } else {
            return n * 2 - step - 1;
        }
    }
}
