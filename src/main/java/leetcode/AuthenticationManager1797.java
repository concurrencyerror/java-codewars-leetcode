package leetcode;

import java.util.HashMap;

public class AuthenticationManager1797 {
    private HashMap<String, Integer> map = new HashMap<>();

    private int timeToLive;

    public AuthenticationManager1797(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        map.put(tokenId, currentTime + timeToLive);
    }

    public void renew(String tokenId, int currentTime) {
        if (map.containsKey(tokenId)) {
            Integer time = map.get(tokenId);
            if (time > currentTime) {
                generate(tokenId, currentTime);
            } else {
                map.remove(tokenId);
            }
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        return (int) map.values().stream().filter(i -> i > currentTime).count();
    }
}
