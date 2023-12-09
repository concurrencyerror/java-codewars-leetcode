package leetcode;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        boolean flag = true;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                flag = allowed.contains(Character.toString(c));
                if (!flag) break;
            }
            if (flag) result++;
            else flag=true;
        }
        return result;
    }
}
