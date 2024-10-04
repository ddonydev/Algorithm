import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < str.length; i++) {
            if(str[i] == null || str[i].equals("")){
                continue;
            }else{
                list.add(str[i]);
            }
        }
        String[] answer = new String[list.size()];

        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }else{
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        return answer;
    }
}