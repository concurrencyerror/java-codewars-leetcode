package leetcode;

import java.util.Arrays;

public class Solution2678 {
    public int countSeniors(String[] details) {
        return Math.toIntExact(Arrays.stream(details).filter(s -> Integer.parseInt(s.substring(11, 13)) > 60).count());
    }
}
