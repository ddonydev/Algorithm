import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length; i++){
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }

        String answer = "";
        for(int i = 0; i < str.length; i++){
            if(map.get(str[i]) == 1){
                answer += str[i];
            }
        }
        
        return answer;
    }
}