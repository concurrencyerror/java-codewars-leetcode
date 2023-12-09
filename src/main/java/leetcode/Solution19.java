package leetcode;

import common.ListNode;

import java.util.LinkedList;

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        LinkedList<ListNode> nodes = new LinkedList<>();
        ListNode result = head;
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        if (nodes.size() >= 2) {
            ListNode node = nodes.get(nodes.size() - n);
            if (nodes.size() == n) {
                return node.next;
            } else {
                ListNode before = nodes.get(nodes.size() - n - 1);
                before.next = node.next;
            }
        } else {
            return null;
        }
        return result;
    }
}
