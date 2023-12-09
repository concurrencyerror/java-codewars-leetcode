package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 2022/4/10
 * leetcode 804. 唯一摩尔斯密码词
 * horace
 */
public class UniqueMorseRepresentations804 {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>() {{
            put('a', ".-");
            put('b', "-...");
            put('c', "-.-.");
            put('d', "-..");
            put('e', ".");
            put('f', "..-.");
            put('g', "--.");
            put('h', "....");
            put('i', "..");
            put('j', ".---");
            put('k', "-.-");
            put('l', ".-..");
            put('m', "--");
            put('n', "-.");
            put('o', "---");
            put('p', ".--.");
            put('q', "--.-");
            put('r', ".-.");
            put('s', "...");
            put('t', "-");
            put('u', "..-");
            put('v', "...-");
            put('w', ".--");
            put('x', "-..-");
            put('y', "-.--");
            put('z', "--..");
        }};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                builder.append(map.get(word.charAt(i)));
            }
            String mos = builder.toString();
            if (hashMap.containsKey(mos)) {
                hashMap.replace(mos, hashMap.get(mos) + 1);
            } else {
                hashMap.put(mos, 1);
            }
        }
        return hashMap.size();
    }
}
