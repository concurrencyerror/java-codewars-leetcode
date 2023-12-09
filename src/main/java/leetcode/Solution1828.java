package leetcode;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution1828 {
    public int[] countPoints(int[][] points, int[][] queries) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] query : queries) {
            int num = 0;
            int x = query[0];
            int y = query[1];
            int length = query[2];
            for (int[] point : points) {
                int xPoint = point[0];
                int yPoint = point[1];
                double result = Math.sqrt(Math.pow(x - xPoint, 2) + Math.pow(y - yPoint, 2));
                if (result <= length) {
                    num++;
                }
            }
            list.add(num);
        }
        int[] results = new int[list.size()];
        IntStream.range(0, list.size()).forEach(i -> results[i] = list.get(i));
        return results;
    }
}
