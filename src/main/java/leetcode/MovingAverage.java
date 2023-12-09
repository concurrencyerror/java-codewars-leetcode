package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022/4/2
 * leetcode 第346，数据流中的移动平均值，这个包内的所有类都为原始的leetcode类
 * horace
 */
public class MovingAverage {
    private final List<Integer> list;
    private final int size;
    private int cur;

    public MovingAverage(int size) {
        this.list = new ArrayList<>();
        this.size = size;
        this.cur = 0;
    }

    public double next(int val) {
        if (cur != size) {
            cur++;
            list.add(val);
            int sum = 0;
            for (Integer i : list) {
                sum += i;
            }
            return (double) sum / cur;
        } else {
            list.remove(0);
            list.add(val);
            int sum = 0;
            for (Integer i : list) {
                sum += i;
            }
            return (double) sum / size;
        }
    }
}
