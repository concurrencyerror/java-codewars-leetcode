package leetcode;

/**
 * 2022/4/7
 * leetcode  796. 旋转字符串
 * horace
 */
public class RotateString796 {
    public boolean rotateString(String s, String goal) {
        StringBuilder builder = new StringBuilder(s.substring(1));
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            if (i >= 1) {
                builder.delete(0, 1);
            }
            if (goal.equals(builder.toString())) {
                return true;
            }
        }
        return false;
    }
}
