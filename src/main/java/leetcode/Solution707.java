package leetcode;

import java.util.LinkedList;

public class Solution707 {
    public static class MyLinkedList {

        private final LinkedList<Integer> base;

        public MyLinkedList() {
            base = new LinkedList<>();
        }

        public int get(int index) {
            if (index < 0 || index >= base.size())
                return -1;
            return base.get(index);
        }

        public void addAtHead(int val) {
            base.addFirst(val);
        }

        public void addAtTail(int val) {
            base.addLast(val);
        }

        public void addAtIndex(int index, int val) {
            if (index <= base.size()) {
                if (index == base.size()) {
                    base.addLast(val);
                } else if (index < 0) {
                    base.addFirst(val);
                } else base.add(index, val);
            }
        }

        public void deleteAtIndex(int index) {
            if (index >= 0 && index < base.size())
                base.remove(index);
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(4);
        myLinkedList.get(1);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(5);
        myLinkedList.deleteAtIndex(3);
        myLinkedList.addAtHead(7);
        myLinkedList.get(3);
        myLinkedList.get(3);
        myLinkedList.get(3);
        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(4);
    }
}
