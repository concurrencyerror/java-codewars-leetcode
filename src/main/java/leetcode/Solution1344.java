package leetcode;

public class Solution1344 {
    public double angleClock(int hour, int minutes) {
        int m = 6;
        int h = 30;
        int mins = minutes * m;
        double i = (double) minutes / 60;
        double hours = i * h + (hour % 12) * h;
        double abs = Math.abs(hours - mins);
        return Math.min(abs, 360 - abs);
    }
}
