package leetcode;

public class Solution2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long result = 0;
        int num = 0;
        while (num <= total) {
            int total2 = total - num;
            int nums = total2 / cost2 + 1;
            result = result + nums;
            num += cost1;
        }
        return result;
    }

}
