package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        int temp = 10000;
        long tem = 1000000000;
        List<String> status = new ArrayList<>();
        if (length >= temp || width >= temp || height >= temp || ((long) length * width * height) >= tem) {
            status.add("Bulky");
        }
        if (mass >= 100) {
            status.add("Heavy");
        }
        if (status.size() == 2) {
            return "Both";
        } else if (status.isEmpty()) {
            return "Neither";
        } else {
            return status.get(0);
        }
    }
}
