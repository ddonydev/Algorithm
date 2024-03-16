import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = Arrays.copyOfRange(num_list, 0, len + 1);
        
        if((num_list[len - 1]) > (num_list[len - 2])){
            answer[answer.length - 1] = (num_list[len - 1]) - (num_list[len - 2]);
        }else{
            answer[answer.length - 1] = (num_list[len - 1]) * 2;
        }
        
        
        return answer;
    }
}