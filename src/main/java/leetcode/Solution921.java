package leetcode;

/**
 * 2022/10/4
 * leetcode 921. 使括号有效的最少添加
 * 可以用分值有效性来做数学判定
 * horace
 */
public class Solution921 {
    public int minAddToMakeValid(String s) {
        int score = 0, ans = 0;
        for (char c : s.toCharArray()) {
            score += c == '(' ? 1 : -1;
            if (score < 0) {
                score = 0; ans++;
            }
        }
        return ans + score;
    }
}
