package leetcode;

import java.util.List;

public class Solution2586 {
    public int vowelStrings(String[] words, int left, int right) {
        List<String> list = List.of("a", "e", "i", "o", "u");
        int result = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if (list.contains(String.valueOf(word.charAt(0))) && list.contains(String.valueOf(word.charAt(word.length() - 1)))) {
                result++;
            }
        }
        return result;
    }
}
