package leetcode;

import java.util.Arrays;

/**
 * 检查两个字符串数组是否相等
 */
public class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        Arrays.stream(word1).forEach(builder::append);
        Arrays.stream(word2).forEach(builder1::append);
        return builder.toString().equals(builder1.toString());
    }
}
