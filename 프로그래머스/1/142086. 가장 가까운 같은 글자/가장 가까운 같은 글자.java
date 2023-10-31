import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                answer[i] = i - map.get(String.valueOf(s.charAt(i)));
            }else{
                answer[i] = -1;
            }
            map.put(String.valueOf(s.charAt(i)), i);
        }
        return answer;
    }
}