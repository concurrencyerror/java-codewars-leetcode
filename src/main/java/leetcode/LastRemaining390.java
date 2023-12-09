package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 2022/1/3
 * leetcode
 * horace
 */
//这次题解分两个，第一个内存过大了，其实没问题的
//第二种方法是通过数学公式来进行求解
public class LastRemaining390 {
    public int lastRemaining(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int i = 1;
        ListIterator<Integer> iterator = list.listIterator();
        while (list.size() != 1) {
            cleanList(list, i % 2 != 0, iterator);
            i++;
        }
        return list.get(0);
    }

    private void cleanList(List<Integer> list, boolean on, ListIterator<Integer> iterator) {
        if (list.size() != 1) {
            int i = 1;
            //正
            if (on) {
                while (iterator.hasNext()) {
                    iterator.next();
                    if (i % 2 != 0) {
                        iterator.remove();
                    }
                    i++;
                }
            } else {
                //反
                while (iterator.hasPrevious()) {
                    iterator.previous();
                    if (i % 2 != 0) {
                        iterator.remove();
                    }
                    i++;
                }
            }
        }
    }

    //这是新的实现，用数学公式算出来的
    public int lastRemaining2(int n) {
        return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemaining2(n / 2));
    }
}
