package leetcode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Solution1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int result = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int[] boxType : boxTypes) {
            if (map.containsKey(boxType[1])){
                map.computeIfPresent(boxType[1], (key, value) -> value + boxType[0]);
            }else {
                map.put(boxType[1], boxType[0]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < truckSize) {
                result += entry.getValue() * entry.getKey();
                truckSize -= entry.getValue();
            } else {
                result += truckSize * entry.getKey();
                break;
            }
        }
        return result;
    }
}