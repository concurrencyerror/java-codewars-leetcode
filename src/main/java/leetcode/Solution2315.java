package leetcode;

public class Solution2315 {
    public int countAsterisks(String s) {
        int result = 0;
        String[] strings = s.split("\\|");
        for (int i = 0, j = 1; i < strings.length; i++, j++) {
            if (j % 2 != 0) {
                String string = strings[j];
                char[] chars = string.toCharArray();
                for (char aChar : chars) {
                    if (aChar == '*') {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
