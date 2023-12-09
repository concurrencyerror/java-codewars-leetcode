package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2022/7/4
 * leetcode 1200. 最小绝对差
 * horace
 */
public class MinimumAbsDifference1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int cur = arr[i + 1] - arr[i];
            if (min > cur) {
                result.clear();
                min = cur;
            }
            if (min == cur) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                result.add(list);
            }
        }
        return result;
    }
}
