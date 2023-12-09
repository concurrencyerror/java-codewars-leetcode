package leetcode;

import java.util.ArrayList;

/**
 * 2022/6/18
 * leetcode 1089. 复写零
 * horace
 */
public class DuplicateZeros1089 {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (j == 0) {
                list.add(j);
                list.add(0);
            } else {
                list.add(j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}
