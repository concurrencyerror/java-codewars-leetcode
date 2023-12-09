package leetcode;

public class Solution2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (numOnes >= k) {
            return k;
        } else {
            if (numOnes + numZeros >= k) {
                return numOnes;
            }else {
                return numOnes - (k - numOnes - numZeros);
            }
        }
    }
}
