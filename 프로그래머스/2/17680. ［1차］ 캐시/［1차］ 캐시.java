import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        List<String> cache = new ArrayList<>();

        int answer = 0;
        if (cacheSize == 0) {
            return 5 * cities.length;
        }
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toLowerCase();
            if (!cache.contains(s)) {
                if (cache.size() < cacheSize) {
                    cache.add(s);
                    answer += 5;
                }else{
                    cache.remove(0);
                    cache.add(s);
                    answer += 5;
                }
            }else{
                cache.remove(s);
                cache.add(s);
                answer += 1;
            }
        }
        return answer;
    }
}