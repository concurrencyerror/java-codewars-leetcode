package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UncommonFromSentences884 {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        String[] sOne = s1.split(" ");
        String[] sTwo = s2.split(" ");
        addSomeThing(temp, list, sOne);
        addSomeThing(temp, list, sTwo);
        return list.toArray(new String[0]);
    }

    private void addSomeThing(List<String> temp, List<String> list, String[] s1) {
        for (String s : s1) {
            if (!temp.contains(s)) {
                if (list.contains(s)) {
                    list.remove(s);
                    temp.add(s);
                } else {
                    list.add(s);
                }
            }
        }
    }
}
