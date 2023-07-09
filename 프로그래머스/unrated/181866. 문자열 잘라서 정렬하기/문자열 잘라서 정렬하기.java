import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        
        List<String> list = new ArrayList<>(Arrays.asList(str));
        list.removeAll(Arrays.asList(""));
        String answer[] = list.toArray(new String[list.size()]);
        
        
        Arrays.sort(answer);
        
        
        return answer;
        
        
    }
}