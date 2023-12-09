package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2363 {
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map1 = Arrays.stream(items1).collect(Collectors.toMap(ints -> ints[0], ints -> ints[1]));
        Map<Integer, Integer> map2 = Arrays.stream(items2).collect(Collectors.toMap(ints -> ints[0], ints -> ints[1]));
        Map<Integer, Integer> map = Stream.concat(map2.entrySet().stream(), map1.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::sum));
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(entry -> List.of(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[][] item1 = new int[][]{new int[]{15, 5}, new int[]{2, 6}, new int[]{5, 3}, new int[]{14, 8}, new int[]{12, 4}, new int[]{19, 6}, new int[]{25, 4}, new int[]{13, 4}, new int[]{9, 1}};
        int[][] item2 = new int[][]{{15, 9}, {2, 4}, {5, 2}, {14, 4}, {12, 3}, {19, 10}, {25, 7}, {13, 6}, {9, 9}};
        mergeSimilarItems(item1, item2);
    }
}
