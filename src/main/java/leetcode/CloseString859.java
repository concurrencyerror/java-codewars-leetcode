package leetcode;

/**
 * @author: horace
 * @date: 2021/11/23
 * @description: 描述
 */
public class CloseString859 {
    public boolean buddyStrings(String s, String goal) {
        int change = 0;
        int[] a = new int[26];
        int[] b = new int[26];
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            int gg = s.charAt(i) - 'a';
            int ggs = goal.charAt(i) - 'a';
            a[gg]++;
            b[ggs]++;
            if (gg != ggs) change++;
        }
        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
            if (a[i] > 1) ok = true;
        }
        return change == 2 || (change == 0 && ok);

    }
}
