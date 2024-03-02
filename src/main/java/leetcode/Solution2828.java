package leetcode;

import java.util.List;

public class Solution2828 {
    public boolean isAcronym(List<String> words, String s) {
        String listString = words.stream().map(item -> String.valueOf(item.charAt(0))).reduce((v1, v2) -> v1 + v2).orElse("");
        return listString.equals(s);
    }
}
