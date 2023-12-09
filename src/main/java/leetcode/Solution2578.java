package leetcode;

import java.util.ArrayList;

public class Solution2578 {
    public int splitNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            int i = num % 10;
            list.add(i);
            num /= 10;
        }
        int first = 0;
        int second = 0;
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                second = second * 10 + list.get(i);
            }else {
                first = first * 10 + list.get(i);
            }
        }
        return first + second;
    }
}
