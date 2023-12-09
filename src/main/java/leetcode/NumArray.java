package leetcode;

public class NumArray {
    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += nums[i];
        }
        return result;
    }
}
