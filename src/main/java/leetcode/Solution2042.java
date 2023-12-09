package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2042 {
    public boolean areNumbersAscending(String s) {
        String[] strings = s.split(" ");
        List<Integer> list = Arrays.stream(strings).filter(this::isNumber).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
