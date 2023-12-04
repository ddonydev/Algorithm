import java.util.*;
class Solution {
    public String solution(String X, String Y) {

        Map<Integer, Integer> xMap = new HashMap<>();
        for (String key : X.split("")) {
            int num = Integer.parseInt(key);
            xMap.put(num, xMap.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> yMap = new HashMap<>();
        for (String key : Y.split("")) {
            int num = Integer.parseInt(key);
            yMap.put(num, yMap.getOrDefault(num, 0) + 1);
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            if (xMap.containsKey(i) && yMap.containsKey(i)) {
                int cnt = Math.min(xMap.get(i), yMap.get(i));
                for (int j = 0; j < cnt; j++) {
                    answer.append(i);
                }
            }
        }

        if (answer.toString().startsWith("0")) {
            return "0";
        } else if (answer.toString().equals("")) {
            return "-1";
        }
        
        return answer.toString();
    }
}