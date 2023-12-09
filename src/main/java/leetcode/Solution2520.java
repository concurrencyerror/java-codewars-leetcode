package leetcode;

public class Solution2520 {
    public int countDigits(int num) {
        int result = 0;
        int origin = num;
        while (num != 0) {
            int val = num % 10;
            if (origin % val == 0)
                result++;
            num /= 10;
        }
        return result;
    }
}
