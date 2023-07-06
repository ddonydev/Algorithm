import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")){
                list.add(strArr[i]);
            }
        }

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}