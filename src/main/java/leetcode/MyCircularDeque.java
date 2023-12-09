package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyCircularDeque {
    private final Deque<Integer> circularDeque;
    private Integer size;

    public MyCircularDeque(int k) {
        circularDeque = new ArrayDeque<>();
        size = k;
    }

    public boolean insertFront(int value) {
        if (circularDeque.size() < size) {
            circularDeque.addFirst(value);
            return true;
        } else
            return false;

    }

    public boolean insertLast(int value) {
        if (circularDeque.size() < size) {
            circularDeque.addLast(value);
            return true;
        } else
            return false;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;
        return circularDeque.removeFirst() != null;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;
        return circularDeque.removeLast() != null;
    }

    public int getFront() {
        if (circularDeque.isEmpty())
            return -1;
        return circularDeque.getFirst();
    }

    public int getRear() {
        if (circularDeque.isEmpty())
            return -1;
        return circularDeque.getLast();
    }

    public boolean isEmpty() {
        return circularDeque.isEmpty();
    }

    public boolean isFull() {
        return circularDeque.size() == size;
    }
}
