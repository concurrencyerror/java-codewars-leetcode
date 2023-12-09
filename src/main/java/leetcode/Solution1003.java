package leetcode;

public class Solution1003 {
    public boolean isValid(String s) {
        if (!s.contains("abc")) {
            return false;
        }
        while (s.contains("abc")) {
            s = s.replace("abc", "");
        }
        return s.equals("");
    }
}
