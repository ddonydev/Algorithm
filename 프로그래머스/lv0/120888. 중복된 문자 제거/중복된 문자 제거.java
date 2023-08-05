import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String my_string) {
        
        String[] str = my_string.split("");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (!list.contains(str[i])) {
                list.add(str[i]);
            }
        }

        String answer = "";
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}