package leetcode;

/**
 * @author: horace
 * @date: 2021/10/2
 * @description: 提莫攻击
 */
class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result=0;
        for (int i = 1; i < timeSeries.length; i++) {
            int time = timeSeries[i] - timeSeries[i - 1];
            result += Math.min(time, duration);
        }
        return result+duration;
    }
}
