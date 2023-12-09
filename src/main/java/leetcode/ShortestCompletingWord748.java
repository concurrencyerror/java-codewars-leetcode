package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2021/12/10
 * leetcode
 * horace
 */
public class ShortestCompletingWord748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cnt = getCnt(licensePlate);
        String ans=null;
        for (String s : words) {
            int[] ints = getCnt(s);
        }
        return null;
    }

    int[] getCnt(String word) {
        int[] ints = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) ints[Character.toLowerCase(c) - 'a']++;
        }
        return ints;
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> stringStringHashMap = new HashMap<>();
        for (Map.Entry<String, List<String>> stringListEntry : stringStringHashMap.entrySet()) {
            List<String> value = stringListEntry.getValue();
        }
    }
}
