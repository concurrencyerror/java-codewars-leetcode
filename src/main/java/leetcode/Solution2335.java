package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution2335 {
    public int fillCups(int[] amount) {
        int result = 0;
        ArrayList<Integer> list = Arrays.stream(amount).boxed().sorted().collect(Collectors.toCollection(ArrayList::new));
        while (list.stream().filter(integer -> integer == 0).count() < 2) {
            result++;
            list.set(1, list.get(1) - 1);
            list.set(2, list.get(2) - 1);
            Collections.sort(list);
        }
        Integer num = list.stream().filter(integer -> integer != 0).findFirst().orElse(0);
        return result + num;
    }
}
