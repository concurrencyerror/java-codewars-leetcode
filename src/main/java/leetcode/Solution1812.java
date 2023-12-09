package leetcode;

public class Solution1812 {
    public boolean squareIsWhite(String coordinates) {
        char[] chars = coordinates.toCharArray();
        if (isOdd(chars[1] - 'a')) {
            return isOdd(Integer.parseInt(coordinates.substring(1)));
        } else {
            return !isOdd(Integer.parseInt(coordinates.substring(1)));
        }
    }

    private boolean isOdd(int num) {
        return num % 2 == 0;
    }
}
