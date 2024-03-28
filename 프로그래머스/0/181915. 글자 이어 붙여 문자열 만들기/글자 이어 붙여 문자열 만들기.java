import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < my_string.length(); i++){
            map.put(i, my_string.charAt(i));
        }        
        for(int i : index_list){
            answer += map.get(i);
        } 
        
        return answer;
    }
}