package leetcode;

public class Solution1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int result = 0;
        int[] ints = new int[60];
        for (int i : time) {
            i %= 60;
            int y = (60 - i) % 60;
            result += ints[y];
            ints[i]++;
        }
        return result;
    }
}
