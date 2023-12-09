package leetcode;

import java.util.Arrays;

public class Solution2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result = 0;
        int sum = Arrays.stream(energy).sum();
        if (sum >= initialEnergy) {
            result = result + sum - initialEnergy + 1;
        }
        for (int ex : experience) {
            if (initialExperience <= ex) {
                result = result + ex - initialExperience + 1;
                initialExperience = ex + 1;
            }
            initialExperience += ex;
        }
        return result;
    }
}
