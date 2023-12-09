package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. 在长度 2N 的数组中找出重复 N 次的元素
 */
public class RepeatedNTimes961 {
    public int repeatedNTimes(int[] nums) {
        int result = 0;
        int resultNum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (resultNum < entry.getValue()) {
                resultNum = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
