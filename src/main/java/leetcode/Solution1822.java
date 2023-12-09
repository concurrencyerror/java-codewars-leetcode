package leetcode;

public class Solution1822 {
    public int arraySign(int[] nums) {
        int out = 0;
        boolean isZero = false;
        for (int num : nums) {
            if (num < 0)
                out++;
            if (num == 0) {
                isZero = true;
                break;
            }
        }
        boolean b = out % 2 == 0;
        return isZero ? 0 : b ? 1 : -1;
    }
}
