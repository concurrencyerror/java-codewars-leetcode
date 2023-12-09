package leetcode;

import java.util.HashSet;

/**
 * @author: horace
 * @date: 2021/11/16
 * @description: 描述
 */
public class chooseCandy575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : candyType) {
            set.add(j);
        }
        return Math.min(set.size(), (candyType.length / 2));
    }
}
