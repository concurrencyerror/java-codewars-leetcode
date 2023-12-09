package leetcode;

public class CountGoodRectangles1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int big = 0;
        int result = 0;
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            if (big < min) {
                result = 1;
                big = min;
            } else if (big == min) {
                result++;
            }
        }
        return result;
    }
}
