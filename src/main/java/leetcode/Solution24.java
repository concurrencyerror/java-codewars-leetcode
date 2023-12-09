package leetcode;

import common.ListNode;

import java.util.Objects;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next)) {
            return head;
        }
        ListNode result = head.next;
        ListNode lastNode = null;
        while (Objects.nonNull(head)) {
            //second node
            ListNode second = head.next;
            if (Objects.nonNull(second)) {
                //other node
                ListNode node = second.next;
                second.next = head;
                head.next = node;
                if (Objects.nonNull(lastNode)) {
                    lastNode.next = second;
                }
                lastNode = head;
            }
            head = head.next;
        }
        return result;
    }
}
