package leetcode;

public class AddDigits258 {
    public int addDigits(int num) {
        while (num / 10 != 0) {
            num = addNum(num);
        }
        return num;
    }

    private int addNum(int num) {
        int result = 0;
        while (num != 0) {
            int i = num % 10;
            result += i;
            num /= 10;
        }
        return result;
    }
}
