package leetcode;

public class Solution1189 {
    public int maxNumberOfBalloons(String text) {
        int bcount = 0;
        int acount = 0;
        int lcount = 0;
        int ocount = 0;
        int ncount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b') {
                bcount++;
            } else if (text.charAt(i) == 'a') {
                acount++;
            } else if (text.charAt(i) == 'l') {
                lcount++;
            } else if (text.charAt(i) == 'o') {
                ocount++;
            } else if (text.charAt(i) == 'n') {
                ncount++;
            }
        }
        return Math.min(ncount, Math.min(bcount, Math.min(acount, Math.min(lcount / 2, ocount / 2))));
    }
}
