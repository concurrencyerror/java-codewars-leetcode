package leetcode;

import java.util.Arrays;

public class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;
        for (int cost : costs) {
            if (coins - cost >= 0) {
                result++;
                coins -= cost;
            } else break;
        }
        return result;
    }
}
