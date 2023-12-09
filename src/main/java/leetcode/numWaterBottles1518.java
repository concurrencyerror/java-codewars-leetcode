package leetcode;

/**
 * 2021/12/17
 * leetcode
 * horace
 */
public class numWaterBottles1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles < numExchange) {
            return numBottles;
        }
        int result = 0;

        while (numBottles >= numExchange) {
            numBottles = numBottles - numExchange + 1;
            result += numExchange;
        }
        return result + numBottles;
    }

    public static void main(String[] args) {
        numWaterBottles(15, 4);
    }
}
