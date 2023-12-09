package leetcode;

import java.util.ArrayList;

public class Solution2379 {
    public static int minimumRecolors(String blocks, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < blocks.length(); i++) {
            int result = 0;
            if (i + k > blocks.length()) {
                break;
            }
            for (int j = i; j < k + i; j++) {
                if (blocks.charAt(j) == 'W') {
                    result++;
                }
            }
            list.add(result);
        }
        return list.stream().mapToInt(i -> i).min().orElse(0);
    }


}
