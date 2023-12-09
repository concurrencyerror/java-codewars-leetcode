package leetcode;

/**
 * 2022/4/14
 * leetcode 1672. 最富有客户的资产总量
 * horace
 */
public class MaximumWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
