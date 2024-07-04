import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < finished.length; i++){
            if(!finished[i]){
                list.add(i);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = todo_list[list.get(i)];
        }
        return answer;
    }
}