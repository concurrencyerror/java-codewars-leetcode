package leetcode;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 2022/1/3
 * leetcode
 * horace
 */
public class DayOfTheWeek1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
        return switch (value) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> null;
        };
    }
}
