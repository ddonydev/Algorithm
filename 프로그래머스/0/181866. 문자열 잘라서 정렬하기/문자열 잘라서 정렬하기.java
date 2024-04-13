import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);

        List<String> list = new ArrayList<>(Arrays.asList(str));
        list.removeAll(Arrays.asList(""));
        
        return list.toArray(new String[list.size()]);
        
    }
}