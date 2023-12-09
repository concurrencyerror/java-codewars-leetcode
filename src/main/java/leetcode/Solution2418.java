package leetcode;

import java.util.stream.IntStream;

public class Solution2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        return IntStream.range(0, heights.length).boxed().sorted((v1, v2) -> -Integer.compare(heights[v1], heights[v2]))
                .map(i -> names[i]).toArray(String[]::new);
    }
}
