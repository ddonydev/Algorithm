import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                int cnt = map.get(tangerine[i]);
                map.put(tangerine[i], cnt += 1);
            }else{
                map.put(tangerine[i], 1);
            }
        }

        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < valueList.size(); i++) {
            if (k <= 0) {
                break;
            }

            k -= valueList.get(i);
            cnt++;
        }
        return cnt;
    }
}