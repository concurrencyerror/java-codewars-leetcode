package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestInfiniteSet {
    private final List<Integer> removeList;

    private final List<Integer> currentSmallList;

    private Integer small;

    public SmallestInfiniteSet() {
        small = 1;
        removeList = new ArrayList<>();
        currentSmallList = new ArrayList<>();
    }

    public int popSmallest() {
        int result;
        if (currentSmallList.isEmpty()) {
            result = small;
            removeList.add(result);
            small++;
        } else {
            Collections.sort(currentSmallList);
            result = currentSmallList.get(0);
            currentSmallList.remove(Integer.valueOf(result));
        }
        return result;
    }

    public void addBack(int num) {
        if (removeList.contains(num) && !currentSmallList.contains(num)) {
            currentSmallList.add(num);
        }
    }
}
