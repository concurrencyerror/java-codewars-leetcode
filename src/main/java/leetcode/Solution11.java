package leetcode;

public class Solution11 {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            result = Math.max((right - left) * Math.min(height[left], height[right]), result);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
