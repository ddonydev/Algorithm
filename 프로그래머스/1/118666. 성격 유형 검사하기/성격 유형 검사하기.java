import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> type = new HashMap<>();
        type.put("RT", 0);
        type.put("CF", 0);
        type.put("JM", 0);
        type.put("AN", 0);

        for(int i = 0; i < choices.length; i++){
            if (type.containsKey(survey[i])) {
                type.put(survey[i], type.get(survey[i]) + (choices[i] - 4));
            }else{
                survey[i] = String.valueOf(survey[i].charAt(1)) + String.valueOf(survey[i].charAt(0));
                type.put(survey[i], type.get(survey[i]) - (choices[i] - 4));
            }
        }

        String answer = "";

        for (String key : type.keySet()) {
            String[] str = key.split("");
            if (type.get(key) < 0) {
                answer += str[0];
            } else if (type.get(key) > 0) {
                answer += str[1];
            }else{
                answer += str[0];
            }
        }
        return answer;
    }
}