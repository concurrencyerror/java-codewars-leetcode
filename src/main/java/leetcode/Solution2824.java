package leetcode;

import java.util.List;

public class Solution2824 {
    public int countPairs(List<Integer> nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (target > (nums.get(i) + nums.get(j))) result++;
            }
        }
        return result;
    }
}
