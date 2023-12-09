package leetcode;

/**
 * 2022/5/12
 * leetcode 944. 删列造序
 * horace
 */
public class MinDeletionSize944 {
    public int minDeletionSize(String[] strs) {
        int result = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                char c = strs[i - 1].charAt(j);
                char c1 = strs[i].charAt(j);
                if (c > c1) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MinDeletionSize944 minDeletionSize944 = new MinDeletionSize944();
        int i = minDeletionSize944.minDeletionSize(new String[]{"cba", "daf", "ghi"});
        int i1 = minDeletionSize944.minDeletionSize(new String[]{"a", "b"});
        System.out.println(i);
        System.out.println(i1);
    }
}
