package leetcode;

/**
 * @author: horace
 * @date: 2021/12/1
 * @description: 描述
 */
public class MaxPower1446 {
    public static int maxPower(String s) {
        int result = 0;
        int temp = 0;
        boolean isAll = true;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                temp += 2;
            } else {
                result = Math.max(result, temp);
                temp = 0;
                isAll = false;
            }
        }
        if (isAll) {
            return temp - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("cc"));
    }
}
