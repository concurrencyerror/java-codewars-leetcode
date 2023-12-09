package leetcode;

import java.util.Arrays;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
        } else {
            if (nums1.length - m >= 0) System.arraycopy(nums2, 0, nums1, m, nums1.length - m);
            Arrays.sort(nums1);
        }
    }
}
