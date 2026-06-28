package leetcode;

import java.util.Arrays;

public class Solution1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != 1) {
                    arr[i] = 1;
                }
                max = arr[i];
            } else {
                if (arr[i] - arr[i - 1] > 1) {
                    arr[i] = arr[i - 1] + 1;
                }
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }
}
