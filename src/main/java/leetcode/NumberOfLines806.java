package leetcode;

/**
 * 2022/4/12
 * leetcode 806. 写字符串需要的行数
 * horace
 */
public class NumberOfLines806 {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        //行高
        int h = 1;
        for (int i = 0; i < s.length(); i++) {
            sum += widths[s.charAt(i) - 'a'];
            if (sum > 100) {
                h++;
                sum = 0;
                sum += widths[s.charAt(i) - 'a'];
            }
        }
        int[] result = new int[2];
        result[0] = h;
        result[1] = sum;
        return result;
    }
}
