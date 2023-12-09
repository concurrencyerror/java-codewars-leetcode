package leetcode;

/**
 * @author: horace
 * @date: 2021/11/15
 * @description: 描述
 */
public class LightSwitch319 {
//        public static int bulbSwitch(int n) {
//        int[] results = new int[n];
//        for (int i = 2; i <= n; i++) {
//            for (int j = i - 1; j < results.length; j += i) {
//                results[j] = results[j] == 1 ? 0 : 1;
//            }
//        }
//        int count = 0;
//        for (int result : results) {
//            if (result == 0) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 26; i++) {
            System.out.println(i + "=" + bulbSwitch(i));
        }
        int count = 0;
        int i = 1;
        int now = 24;
        while (now >= 0) {
            count++;
            now -= i;
            i += 2;
        }
        System.out.println(count);
    }
}
