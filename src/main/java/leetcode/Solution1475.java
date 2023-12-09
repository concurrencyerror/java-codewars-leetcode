package leetcode;

public class Solution1475 {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            result[i] = price;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= price) {
                    result[i] = price - prices[j];
                    break;
                }
            }
        }
        return result;
    }
}
