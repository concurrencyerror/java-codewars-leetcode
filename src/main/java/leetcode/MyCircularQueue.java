package leetcode;

import java.util.ArrayDeque;

/**
 * 2022/8/3
 * leetcode
 * horace
 */
public class MyCircularQueue {
    private ArrayDeque<Integer> base;
    private int size;

    public MyCircularQueue(int k) {
        base = new ArrayDeque<>(k);
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        return base.add(value);
    }

    public boolean deQueue() {
        if (!base.isEmpty()) {
            base.remove();
            return true;
        }
        return false;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return base.getFirst();
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return base.getLast();
    }

    public boolean isEmpty() {
        return base.isEmpty();
    }

    public boolean isFull() {
        return size == base.size();
    }
}
