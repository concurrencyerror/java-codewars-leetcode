package leetcode;

public class Solution2303 {
    public double calculateTax(int[][] brackets, int income) {
        double result = 0;
        for (int i = 0; i < brackets.length; i++) {
            int price = brackets[i][0];
            int pay = brackets[i][1];
            if (i - 1 < 0) {
                if (price <= income) {
                    result = result + price * pay * 0.01;
                } else {
                    result = result + income * pay * 0.01;
                    break;
                }
            } else {
                if (price <= income) {
                    result = result + (price - brackets[i - 1][0]) * pay * 0.01;
                } else {
                    result = result + (income - brackets[i - 1][0]) * pay * 0.01;
                    break;
                }
            }
        }
        return result;
    }
}
