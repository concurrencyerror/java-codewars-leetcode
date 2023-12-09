package leetcode;

public class Solution2437 {
    public static int countTime(String time) {
        int result = 1;
        String[] split = time.split(":");
        String hour = split[0];
        String min = split[1];
        if (hour.charAt(0) == '?') {
            if (hour.charAt(1) != '?') {
                int i = Integer.parseInt(String.valueOf(hour.charAt(1)));
                if (i > 4) {
                    result *= 2;
                } else {
                    result *= 3;
                }
            } else {
                result *= 24;
            }
        } else {
            if (hour.charAt(1) == '?') {
                int i = Integer.parseInt(String.valueOf(hour.charAt(0)));
                if (i == 2) {
                    result *= 5;
                } else {
                    result *= 10;
                }
            }
        }
        if (min.charAt(0) == '?') {
            if (min.charAt(1) == '?') {
                result *= 60;
            } else {
                result *= 6;
            }
        } else {
            if (min.charAt(1) == '?') {
                result *= 10;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        countTime("2?:??");
    }
}
