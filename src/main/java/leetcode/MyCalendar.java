package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022/7/5
 * leetcode 729. 我的日程安排表 I
 * 这题我写的时候就感觉像是二叉树的东西，虽然这个解法很暴力，但是目前看题解是线段树
 * 估计又是哪个我知道是什么但是不知道名字的东西。。。。。。。。。
 * 我之后学习一下，看能不能再写一版线段树的出来
 * horace
 */
public class MyCalendar {
    private final List<List<Integer>> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        List<Integer> bookList = new ArrayList<>();
        bookList.add(start);
        bookList.add(end);
        for (List<Integer> integers : list) {
            if (bookList.get(1) > integers.get(0) && bookList.get(0) < integers.get(1)) {
                return false;
            }
        }
        list.add(bookList);
        return true;
    }
}
