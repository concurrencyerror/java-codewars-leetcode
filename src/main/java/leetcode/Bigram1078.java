package leetcode;

import java.util.ArrayList;

/**
 * 2021/12/28
 * leetcode
 * horace
 */
public class Bigram1078 {
    public static String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        ArrayList<String> result = new ArrayList<>();
        boolean start = false;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].equals(first)) start = true;
            if (strings[i].equals(second) && start) {
                if ((i + 1) < strings.length) {
                    result.add(strings[i + 1]);
                    start = false;
                }
            } else {
                start = false;
            }
        }
        String[] fal = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            fal[i] = result.get(i);
        }
        return fal;
    }

    public static void main(String[] args) {
        findOcurrences("alice is a good girl she is a good student", "a", "good");
    }
}
