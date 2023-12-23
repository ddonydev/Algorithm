import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> nick = new HashMap<>();
        for(int i = 0; i < record.length; i++){
            String[] s = record[i].split(" ");
            if(!s[0].equals("Leave")){
                nick.put(s[1], s[2]);                
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] s = record[i].split(" ");
            if(s[0].equals("Change")){
                continue;
            }
            if(s[0].equals("Enter")){
                list.add(nick.get(s[1]) + "님이 들어왔습니다.");
            }else if(s[0].equals("Leave")){
                list.add(nick.get(s[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}