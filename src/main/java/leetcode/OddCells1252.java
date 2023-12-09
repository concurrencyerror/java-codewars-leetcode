package leetcode;

/**
 * 2022/7/12
 * leetcode 1252. 奇数值单元格的数目
 * horace
 */
public class OddCells1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ints = new int[m][n];
        for (int[] value : indices) {
            int index = value[0];
            int begin = value[1];
            makeData(index, begin, ints);
        }
        int result = 0;
        for (int[] anInt : ints) {
            for (int i : anInt) {
                if (i % 2 != 0) {
                    result++;
                }
            }
        }
        return result;
    }

    private void makeData(int g, int q, int[][] base) {
        for (int i = 0; i < base[g].length; i++) {
            base[g][i]++;
        }
        for (int i = 0; i < base.length; i++) {
            base[i][q]++;
        }
    }
}
