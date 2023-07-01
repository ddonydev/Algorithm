class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                len += 1;
            }
        }
        
        String[] answer = new String[len];
        
        int index = 0;
        
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                answer[index++] = todo_list[i];
            }
        }
        
        return answer;
    }
}