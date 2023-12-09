package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1796 {
    public int secondHighest(String s) {
        char[] chars = s.toCharArray();
        List<Integer> set = new ArrayList<>();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                set.add(Integer.parseInt(String.valueOf(aChar)));
            }
        }
        List<Integer> list = set.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if (list.size() <= 1) {
            return -1;
        } else {
            return list.get(1);
        }
    }
}
