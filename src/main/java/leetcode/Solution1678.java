package leetcode;

public class Solution1678 {
    public String interpret(String command) {
        char[] chars = command.toCharArray();
        StringBuilder builder = new StringBuilder();
        int deep = 0;
        for (char aChar : chars) {
            if (aChar == '(') {
                deep++;
            } else if (aChar == ')') {
                if (deep == 1) {
                    builder.append("o");
                }
                deep = 0;
            } else {
                if (deep > 0) deep++;
                builder.append(aChar);

            }
        }
        return builder.toString();
    }
}
