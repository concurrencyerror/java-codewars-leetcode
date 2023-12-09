package leetcode;

import java.time.LocalTime;

public class Solution2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        LocalTime start2 = LocalTime.parse(event2[0]);
        LocalTime end2 = LocalTime.parse(event2[1]);
        LocalTime start1 = LocalTime.parse(event1[0]);
        LocalTime end1 = LocalTime.parse(event1[1]);
        if (start2.isBefore(start1) && (end2.isAfter(end1) || end2.isBefore(end1))) {
            return true;
        }
        if (start2.isBefore(end1) && start2.isAfter(start1)) {
            return true;
        }
        if (start2.equals(end1) || start2.equals(start1)) {
            return true;
        }
        if (end2.equals(end1) || end2.equals(start1)) {
            return true;
        }
        return end2.isBefore(end1) && end2.isAfter(start1);
    }
}
