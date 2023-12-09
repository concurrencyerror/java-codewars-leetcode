package leetcode;

public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;
        while (n != 0) {
            int num = n % 10;
            sum += num;
            multi *= num;
            n /= 10;
        }
        return multi - sum;
    }
}
