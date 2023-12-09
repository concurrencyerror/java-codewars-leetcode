package leetcode;

public class Solution1668 {
    public int maxRepeating(String sequence, String word) {
        int result = 0;
        StringBuilder builder = new StringBuilder(word);
        if (!sequence.contains(word))
            return result;
        while (sequence.contains(builder.toString())) {
            result++;
            builder.append(word);
        }
        return result;
    }
}
