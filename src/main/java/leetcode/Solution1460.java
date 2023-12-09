package leetcode;

import java.util.Arrays;

/**
 * 1460. 通过翻转子数组使两个数组相等
 */
public class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target[i]) {
                return false;
            }
        }
        return true;
    }
}
