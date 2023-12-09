package leetcode;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        return jewels.chars().map(i -> {
            int n = 0;
            for (int j = 0; j < stones.length(); j++) {
                if (i == stones.charAt(j)) {
                    n++;
                }
            }
            return n;
        }).sum();
    }
}
