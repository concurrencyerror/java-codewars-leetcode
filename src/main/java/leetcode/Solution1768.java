package leetcode;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(w1[i]).append(w2[i]);
        }
        if (word1.length() > word2.length()) {
            stringBuilder.append(word1.substring(length));
        } else if (word1.length() < word2.length()) {
            stringBuilder.append(word2.substring(length));
        }
        return stringBuilder.toString();
    }
}
