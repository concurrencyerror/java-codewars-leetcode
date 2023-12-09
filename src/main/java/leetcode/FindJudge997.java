package leetcode;

/**
 * 2021/12/19
 * leetcode
 * horace
 */
public class FindJudge997 {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] ints : trust) {
            int a = ints[0];
            int b = ints[1];
            out[a]++;
            in[b]++;
        }
        for (int i = 1; i < (n + 1); i++) {
            int trusts=n-1;
            if (in[i]==trusts&&out[i]==0){
                return i;
            }
        }
        return -1;
    }
}
