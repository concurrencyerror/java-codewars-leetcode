package leetcode;

import java.util.HashMap;

/**
 * 2022/1/19
 * PACKAGE_NAME
 * horace
 */
public class ContainsNearbyDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer under = map.get(nums[i]);
                int fi = under - i;
                if (Math.abs(fi) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
