import java.util.*;
class Solution {
    public String solution(String s) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            list.add((int) s.charAt(i));
        }

        Collections.sort(list);
        
        String answer = "";
        for(int i = list.size() - 1; i >= 0; i--){
            answer += (char) list.get(i).intValue();
        }
        
        return answer;
        
        
    }
}