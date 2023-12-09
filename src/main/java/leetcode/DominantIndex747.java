package leetcode;

/**
 * 2022/1/13
 * PACKAGE_NAME
 * horace
 */
public class DominantIndex747 {
    public int dominantIndex(int[] nums) {
        int max = 0;
        for (int j : nums) {
            max = Math.max(max, j);
        }
        for (int num : nums) {
            if (num != max && max < (num * 2)) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                return i;
            }
        }
        return -1;
    }
}
