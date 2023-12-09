package leetcode;

import common.ListNode;

import java.util.LinkedList;

public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        LinkedList<ListNode> list = new LinkedList<>();
        ListNode result = head;
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        if (list.isEmpty()) return result;
        int index = k % list.size();
        if (index == 0) return result;
        ListNode middle = list.get(list.size() - index);
        ListNode before = list.get(list.size() - index - 1);
        before.next = null;
        ListNode last = list.getLast();
        last.next = result;
        result = middle;
        return result;
    }
}
