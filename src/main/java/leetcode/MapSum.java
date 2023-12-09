package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: horace
 * @date: 2021/11/14
 * @description: key-value 映射
 */
class MapSum {

    private HashMap<String, Integer> temp;

    public MapSum() {
        temp = new HashMap<>();
    }

    public void insert(String key, int val) {
        temp.put(key, val);
    }

    public int sum(String prefix) {
        int result = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : temp.entrySet()) {
            String key = stringIntegerEntry.getKey();
            if (key.length() > prefix.length()) {
                key = key.substring(0, prefix.length());
            }
            if (key.equals(prefix)) {
                result += stringIntegerEntry.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        mapSum.sum("ap");           // return 3 (apple = 3)
        mapSum.insert("app", 2);
        mapSum.sum("ap");
    }
}
