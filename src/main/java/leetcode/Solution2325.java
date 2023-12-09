package leetcode;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2325 {
    public static String decodeMessage(String key, String message) {
        String replace = key.replace(" ", "");
        AtomicInteger val = new AtomicInteger();
        Map<Character, Character> map = IntStream.range(0, replace.length()).boxed().collect(Collectors.toMap(replace::charAt, i -> {
            int increment = val.getAndIncrement();
            return (char) ('a' + increment);
        }, (v1, v2) -> {
            val.decrementAndGet();
            return v1;
        }));
//        for (int i = 0, j = 0; i < replace.length(); i++) {
//            char aChar = replace.charAt(i);
//            if (!map.containsKey(aChar)) {
//                map.put(aChar, (char) ((char) j + 'a'));
//                j++;
//            }
//        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ')
                builder.append(c);
            else
                builder.append(map.get(c));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String s = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        System.out.println(s);
    }

}
