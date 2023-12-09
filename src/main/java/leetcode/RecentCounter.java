package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 2022/5/6
 * leetcode 933. 最近的请求次数
 * 由于题目中的t是增加的，所以不用保留大于grep段的数据，这样的话可以让执行的速度更快
 * horace
 */
public class RecentCounter {
    private List<Integer> count;
    private static int grep = 3000;

    public RecentCounter() {
        count = new ArrayList<>();
    }

    public int ping(int t) {
        int result = 0;
        count.add(t);
        int start = t - grep;
        Iterator<Integer> iterator = count.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next >= start && next <= t) {
                result++;
            } else {
                iterator.remove();
            }
        }
        return result;
    }
}
