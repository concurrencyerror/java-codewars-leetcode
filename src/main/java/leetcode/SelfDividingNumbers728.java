package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022/4/2
 * PACKAGE_NAME
 * horace
 */
public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int mNum = i;
            boolean flag = true;
            while (mNum != 0) {
                int num = mNum % 10;
                if (num == 0) {
                    flag = false;
                    break;
                } else if (i % num != 0) {
                    flag = false;
                    break;
                }
                mNum /= 10;
            }
            if (flag) {
                list.add(i);
            }
        }
        return list;
    }

}
