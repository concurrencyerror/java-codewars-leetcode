package leetcode;

/**
 * 2022/8/20
 * leetcode
 * horace
 */
public class BusyStudent1045 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++) {
            int start = startTime[i];
            if (start <= queryTime) {
                int end = endTime[i];
                if (end >= queryTime) {
                    result++;
                }
            }
        }
        return result;
    }
}
