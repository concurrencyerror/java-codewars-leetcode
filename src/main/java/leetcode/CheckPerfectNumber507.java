package leetcode;

/**
 * 2021/12/31
 * leetcode
 * horace
 */
public class CheckPerfectNumber507 {
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        int result = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        return result == num;
    }
}
