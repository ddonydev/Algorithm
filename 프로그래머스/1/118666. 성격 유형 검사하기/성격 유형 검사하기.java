import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Integer, Integer> choiceMap = new HashMap<>();
        for(int i = 1; i <= 7; i++){
            if(i <= 3){
                choiceMap.put(i, 4 - i);
            }else if(i == 4){
                choiceMap.put(i, 0);
            }else{
                choiceMap.put(i, i - 4);
            }
        }

        Map<String, Integer> type = new LinkedHashMap<>();
        type.put("R", 0);
        type.put("T", 0);
        type.put("C", 0);
        type.put("F", 0);
        type.put("J", 0);
        type.put("M", 0);
        type.put("A", 0);
        type.put("N", 0);

        for(int i = 0; i < choices.length; i++){
            String[] str = survey[i].split("");
            if(choices[i] <= 3){
                type.put(str[0], type.get(str[0]) + choiceMap.get(choices[i]));
            }else if(choices[i] > 3){
                type.put(str[1], type.get(str[1]) + choiceMap.get(choices[i]));
            }
        }
        String[][] types = {{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};
        String answer = "";
        for (int i = 0; i < types.length; i++) {
            if (type.get(types[i][0]) > type.get(types[i][1])) {
                answer += types[i][0];
            }else if(type.get(types[i][0]) < type.get(types[i][1])){
                answer += types[i][1];
            }else{
                Arrays.sort(types[i]);
                answer += types[i][0];
            }
        }
        return answer;
    }
}