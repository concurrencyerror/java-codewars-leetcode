package leetcode;

public class Solution2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int add = mainTank % 5;
        int units = mainTank / 5;
        int should;
        if (add == 0) {
            should = 1;
        } else {
            should = Math.min(add, additionalTank);
        }
        return units * 5 * 10 + should * 10;
    }
}
