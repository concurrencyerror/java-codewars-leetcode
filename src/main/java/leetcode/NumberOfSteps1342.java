package leetcode;

public class NumberOfSteps1342 {
    public int numberOfSteps(int num) {
        int result = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            result++;
        }
        return result;
    }
}
