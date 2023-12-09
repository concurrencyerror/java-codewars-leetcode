package leetcode;

public class Solution1758 {
    public int minOperations(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                result++;
                if (Integer.parseInt(String.valueOf(chars[i])) == 0) {
                    chars[i] = '1';
                } else {
                    chars[i] = '0';
                }
            }
        }
        return result;
    }
}
