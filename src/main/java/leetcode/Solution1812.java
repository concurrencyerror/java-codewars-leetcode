package leetcode;

public class Solution1812 {
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        int num = Integer.parseInt(String.valueOf(chars[1]));
        if (isOdd(chars[0] - 'a')) {
            return isOdd(num);
        } else {
            return !isOdd(num);
        }
    }

    private boolean isOdd(int num) {
        return num % 2 == 0;
    }
}
