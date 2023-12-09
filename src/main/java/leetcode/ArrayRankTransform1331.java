package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1331. 数组序号转换
 */
public class ArrayRankTransform1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer, Integer> map = new HashMap<>();
        int num = 0;
        for (int i : clone) {
            if (!map.containsKey(i)) {
                num += 1;
                map.put(i, num);
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
