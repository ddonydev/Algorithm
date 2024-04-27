import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        
        int index = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(index < indices.length && indices[index] == i){
                index++;
                continue;
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}