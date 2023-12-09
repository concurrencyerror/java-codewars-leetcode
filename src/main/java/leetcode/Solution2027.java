package leetcode;

public class Solution2027 {
    public int minimumMoves(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'X') {
                result++;
                if (i + 2 < chars.length) {
                    chars[i] = 'O';
                    chars[i + 1] = 'O';
                    chars[i + 2] = 'O';
                } else {
                    while (chars.length > i) {
                        chars[i] = 'O';
                        i++;
                    }
                }
            }
        }
        return result;
    }
}
