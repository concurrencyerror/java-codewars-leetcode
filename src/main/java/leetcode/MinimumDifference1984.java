package leetcode;

import java.util.Arrays;

public class MinimumDifference1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, ans = nums[k - 1] - nums[0];
        for (int i = k; i < n; i++) {
            ans = Math.min(ans, nums[i] - nums[i - k + 1]);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
