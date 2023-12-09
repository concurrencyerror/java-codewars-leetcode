package leetcode;

import java.util.HashSet;

public class Solution1015 {
    public static int smallestRepunitDivByK(int k) {
        int mod = 1 % k;
        int result = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(mod);
        while (mod != 0) {
            mod = (mod * 10 + 1) % k;
            if (set.contains(mod)) {
                return -1;
            }
            set.add(mod);
            result++;
        }
        return result;
    }
}
