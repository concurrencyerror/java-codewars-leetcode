package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfUnique1748 {
    public int sumOfUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> no = new ArrayList<>();
        for (int num : nums) {
            if (!no.contains(num)) {
                if (temp.contains(num)) {
                    temp.remove(Integer.valueOf(num));
                    no.add(num);
                } else {
                    temp.add(num);
                }
            }
        }
        return temp.stream().mapToInt(Integer::intValue).sum();
    }
}
