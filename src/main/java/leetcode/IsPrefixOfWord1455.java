package leetcode;

/**
 * 2022/8/21
 * leetcode
 * horace
 */
public class IsPrefixOfWord1455 {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            String target = s[i];
            if (target.length() >= searchWord.length()) {
                if (target.startsWith(searchWord)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int prefixOfWord = isPrefixOfWord("i love eating burger", "burg");
        System.out.println(prefixOfWord);
    }
}
