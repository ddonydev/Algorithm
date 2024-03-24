import java.util.*;
class Solution {
    public String solution(String rsp) {
        
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "0");
        map.put("0", "5");
        map.put("5", "2");
        
        String answer = "";
        for(int i = 0; i < rsp.length(); i++){
            answer += map.get(String.valueOf(rsp.charAt(i)));
        }
        
        
        return answer;
    }
}