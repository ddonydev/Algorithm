import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        String[] str = s.split("");
        List<String> list = new ArrayList<>();
        for(int i = 97; i < 123; i++){
            list.add(Character.toString(i));
        }
        
        for(int i = 0; i < str.length; i++){
            int cnt = index;
            int idx = list.indexOf(str[i]);
            while(cnt > 0){
                idx++;
                if(idx == list.size()){
                    idx = 0;
                }
                if(skip.contains(list.get(idx))){
                    continue;
                }
                cnt -= 1;
            }
            answer += list.get(idx);
        }
        
        return answer;
    }
}