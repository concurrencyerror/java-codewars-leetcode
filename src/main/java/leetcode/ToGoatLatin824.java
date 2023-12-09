package leetcode;

/**
 * 2022/4/23
 * leetcode
 * horace
 */
public class ToGoatLatin824 {
    public String toGoatLatin(String sentence) {
        String[] temp = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            StringBuilder builder;
            char c = temp[i].toLowerCase().charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                builder = new StringBuilder(temp[i]);
                builder.append("ma");
            } else {
                char first = temp[i].charAt(0);
                String substring = temp[i].substring(1);
                builder = new StringBuilder(substring).append(first);
                builder.append("ma");
            }
            result.append(builder.append(makeA(i + 1))).append(" ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    private String makeA(int i) {
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            builder.append("a");
        }
        return builder.toString();
    }
}
