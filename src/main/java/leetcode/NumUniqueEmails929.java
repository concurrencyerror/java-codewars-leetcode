package leetcode;

import java.util.HashSet;

public class NumUniqueEmails929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            String[] split = email.split("@");
            String replace = split[0].replace(".", "");
            String[] split1 = replace.split("\\+");
            set.add(split1[0] + "@" + split[1]);
        }
        return set.size();
    }
}
