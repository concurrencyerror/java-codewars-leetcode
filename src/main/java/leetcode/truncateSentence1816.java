package leetcode;

/**
 * @author: horace
 * @date: 2021/12/6
 * @description: 描述
 */
public class truncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        if (s1.length <= k) {
            return s;
        } else {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < k; i++) {
                if ((i + 1) == k) {
                    builder.append(s1[i]);
                } else {
                    builder.append(s1[i]).append(" ");
                }
            }
            return builder.toString();
        }
    }
}
