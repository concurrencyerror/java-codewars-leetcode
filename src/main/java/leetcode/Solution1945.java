package leetcode;

public class Solution1945 {
    public static int getLucky(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char aChar : chars) {
            builder.append(handle(aChar - 'a' + 1));
        }
        int parseInt = Integer.parseInt(builder.toString());
        for (int i = 0; i < k - 1; i++) {
            parseInt = handle(parseInt);
        }
        return parseInt;
    }

    private static int handle(int num) {
        int result = 0;
        while (num != 0) {
            int val = num % 10;
            result += val;
            num /= num;
        }
        return result;
    }
}
