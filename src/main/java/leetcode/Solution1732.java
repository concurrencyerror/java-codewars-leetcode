package leetcode;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int currentAltitude = 0;
        for (int j : gain) {
            currentAltitude += j;
            result = Math.max(result, currentAltitude);
        }
        return result;
    }
}
