package leetcode;

import java.util.ArrayList;

/**
 * 2022/4/28
 * leetcode
 * horace
 */
public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                list.add(num);
            } else {
                odd.add(num);
            }
        }
        list.addAll(odd);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
