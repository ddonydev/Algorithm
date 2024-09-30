import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }
        int answer = 0;
        for (Integer i : map.keySet()) {
            answer = Math.max(answer, map.get(i));
        }
        return answer;
    }
}