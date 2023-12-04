import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        Map<Integer, Boolean> sectionMap = new HashMap<>();
        for(int i = 1; i <= n; i++){
            sectionMap.put(i, true);
        }

        for (int i = 0; i < section.length; i++) {
            if (sectionMap.containsKey(section[i])) {
                sectionMap.put(section[i], false);
            }
        }

        int answer = 0;
        for (int i = 0; i < section.length; i++) {
            if (!sectionMap.get(section[i])) {
                answer++;
                for (int j = section[i]; j < section[i] + m; j++) {
                    sectionMap.put(j, true);
                }
            }
            if (sectionMap.get(section[section.length - 1])) {
                break;
            }
        }
        return answer;
    }
}