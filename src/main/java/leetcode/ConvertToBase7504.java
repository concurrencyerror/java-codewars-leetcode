package leetcode;

public class ConvertToBase7504 {
    public String convertToBase7(int num) {
        boolean flag = num < 0;
        if (flag) num = -num;
        StringBuilder builder = new StringBuilder();
        do {
            builder.append(num % 7);
            num /= 7;
        } while (num > 0);
        builder.reverse();
        return flag ? "-" + builder : builder.toString();
    }
}
