package leetcode;

/**
 * 2022/10/3
 * leetcode 1784. 检查二进制字符串字段
 * horace
 */
public class Solution1784 {
    public static boolean checkOnesSegment(String s) {
        int where = s.indexOf("0");
        if (where != -1) {
            for (int i = where; i < s.length(); i++) {
                int value = Integer.parseInt(String.valueOf(s.charAt(i)));
                if (value == 1)
                    return false;
            }
        }
        return true;
    }
}
