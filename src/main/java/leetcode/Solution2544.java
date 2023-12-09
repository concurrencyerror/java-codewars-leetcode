package leetcode;

public class Solution2544 {
    public static int alternateDigitSum(int n) {
        int i = 0;
        int result = 0;
        while (n > 0) {
            int m = n % 10;
            i++;
            if (i % 2 == 0) {
                result -= m;
            } else {
                result += m;
            }
            n = n / 10;
        }
        return i % 2 == 0 ? -result : result;
    }
}
