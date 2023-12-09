package leetcode;

import java.util.HashSet;

public class Solution2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 2 == 0 && num <= threshold) {
                int result = 1;
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j] % 2 == nums[j + 1] % 2){
                        break;
                    }
                    if (nums[j + 1] <= threshold) {
                        result++;
                    }else break;
                }
                set.add(result);
            }
        }
        return set.stream().mapToInt(i -> i).max().orElse(0);
    }

}
