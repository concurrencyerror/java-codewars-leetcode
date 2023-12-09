package leetcode;

public class Solution2469 {
    public double[] convertTemperature(double celsius) {
        double[] doubles = new double[2];
        doubles[0] = celsius + 273.15;
        doubles[1] = celsius * 1.80 + 32.00;
        return doubles;
    }
}
