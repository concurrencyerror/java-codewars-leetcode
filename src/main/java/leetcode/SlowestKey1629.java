package leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * 2022/1/9
 * leetcode
 * horace
 */
public class SlowestKey1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        treeMap.put(keysPressed.charAt(0), releaseTimes[0]);
        for (int i = 1; i < releaseTimes.length; i++) {
            char c = keysPressed.charAt(i);
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            if (treeMap.containsKey(c)) {
                Integer before = treeMap.get(c);
                int result = Math.max(before, temp);
                treeMap.put(c, result);
            } else {
                treeMap.put(c, temp);
            }
        }
        int bigger = 0;
        char result = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : treeMap.entrySet()) {
            if (bigger < characterIntegerEntry.getValue()) {
                result = characterIntegerEntry.getKey();
                bigger = characterIntegerEntry.getValue();
            }
        }
        return result;
    }
}
