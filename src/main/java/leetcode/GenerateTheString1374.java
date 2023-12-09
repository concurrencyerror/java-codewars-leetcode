package leetcode;

/**
 * 1374. 生成每种字符都是奇数个的字符串
 */
public class GenerateTheString1374 {
    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        if (n % 2 == 0) {
            builder.append("a");
            builder.append("b".repeat(n - 1));
        } else {
            builder.append("a".repeat(n));
        }
        return builder.toString();
    }
}
