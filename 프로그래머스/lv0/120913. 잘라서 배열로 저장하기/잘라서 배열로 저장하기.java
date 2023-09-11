import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        String str = "";

        for (int i = 0; i < my_str.length(); i+=n) {
            if(i + n <= my_str.length()){
                str = my_str.substring(i, i + n);
                list.add(str);
            }else{
                str = my_str.substring(i);
                list.add(str);
            }
        }

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}